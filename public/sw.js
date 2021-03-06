importScripts('/assets/lib/sw-toolbox/sw-toolbox.js');

function networkOnlyError(request, values, options) {
  return toolbox.networkOnly(request, values, options).catch((err) => {
    return toolbox.cacheOnly(new Request('/offline'));
  });
}

function networkFirstError(request, values, options) {
  return toolbox.networkFirst(request, values, options).catch((err) => {
    return toolbox.cacheOnly(new Request('/offline'));
  });
}

function networkFirstIndex(request, values, options) {
  return toolbox.networkFirst(request, values, options).catch((err) => {
    return toolbox.cacheOnly(new Request('/'));
  });
}

// pre cache all urls that are needed for the main and offline page
var preCache = [
    '/',
    '/offline',
    '/assets/bootstrap/css/bootstrap.min.css',
    '/assets/bootstrap/css/bootstrap.min.css',
    '/assets/bootstrap/js/bootstrap.min.js',
    '/assets/javascripts/svg.js',
    '/assets/javascripts/main.js',
    '/assets/lib/jquery/jquery.min.js',
    '/assets/stylesheets/main.css',
    '/assets/images/ore-dark.png',
    '/assets/images/ore-desc.png',
    '/assets/images/spongie-mark.svg'
];

toolbox.precache(preCache);

// show the mainpage even if the request with the query parameters isn't cached
toolbox.router.get( '/', networkFirstIndex );

// deactivate cache for the api and statusz
toolbox.router.get( '/statusz', toolbox.networkOnly );
toolbox.router.get( '/api/(.*)', toolbox.networkOnly );

// downloads are not possible while offline and shouldn't be cached
toolbox.router.get( '/:author/:slug/versions/:version/download', networkOnlyError );
toolbox.router.get( '/:author/:slug/versions/:version/signature', networkOnlyError );
toolbox.router.get( '/:author/:slug/versions/:version/jar', networkOnlyError );

// deactivate cache for some fo the admin routes
toolbox.router.get('/admin/seed', toolbox.networkOnlyError);
toolbox.router.get('/admin/flags/(.*)', toolbox.networkOnlyError);

// logout is not possible while offline
toolbox.router.get('/logout', toolbox.networkOnlyError);

// post requests will not work offline
toolbox.router.post('(.*)', toolbox.networkOnlyError);

// serve every get request from the cache if no connection is available
toolbox.router.get( '(.*)', networkFirstError );
