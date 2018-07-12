package util.syntax

import scala.concurrent.{ExecutionContext, Future}
import scala.language.implicitConversions

trait ParallelSyntax {
  implicit def tuple1ParallelSyntax[A0](t1: Tuple1[Future[A0]]): Tuple1ParallelOps[A0] = new Tuple1ParallelOps(t1)
  implicit def tuple2ParallelSyntax[A0, A1](t2: Tuple2[Future[A0], Future[A1]]): Tuple2ParallelOps[A0, A1] = new Tuple2ParallelOps(t2)
  implicit def tuple3ParallelSyntax[A0, A1, A2](t3: Tuple3[Future[A0], Future[A1], Future[A2]]): Tuple3ParallelOps[A0, A1, A2] = new Tuple3ParallelOps(t3)
  implicit def tuple4ParallelSyntax[A0, A1, A2, A3](t4: Tuple4[Future[A0], Future[A1], Future[A2], Future[A3]]): Tuple4ParallelOps[A0, A1, A2, A3] = new Tuple4ParallelOps(t4)
  implicit def tuple5ParallelSyntax[A0, A1, A2, A3, A4](t5: Tuple5[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4]]): Tuple5ParallelOps[A0, A1, A2, A3, A4] = new Tuple5ParallelOps(t5)
  implicit def tuple6ParallelSyntax[A0, A1, A2, A3, A4, A5](t6: Tuple6[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5]]): Tuple6ParallelOps[A0, A1, A2, A3, A4, A5] = new Tuple6ParallelOps(t6)
  implicit def tuple7ParallelSyntax[A0, A1, A2, A3, A4, A5, A6](t7: Tuple7[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6]]): Tuple7ParallelOps[A0, A1, A2, A3, A4, A5, A6] = new Tuple7ParallelOps(t7)
  implicit def tuple8ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7](t8: Tuple8[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7]]): Tuple8ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7] = new Tuple8ParallelOps(t8)
  implicit def tuple9ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8](t9: Tuple9[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8]]): Tuple9ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8] = new Tuple9ParallelOps(t9)
  implicit def tuple10ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](t10: Tuple10[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9]]): Tuple10ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9] = new Tuple10ParallelOps(t10)
  implicit def tuple11ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](t11: Tuple11[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10]]): Tuple11ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] = new Tuple11ParallelOps(t11)
  implicit def tuple12ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](t12: Tuple12[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11]]): Tuple12ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] = new Tuple12ParallelOps(t12)
  implicit def tuple13ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](t13: Tuple13[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12]]): Tuple13ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] = new Tuple13ParallelOps(t13)
  implicit def tuple14ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](t14: Tuple14[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13]]): Tuple14ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13] = new Tuple14ParallelOps(t14)
  implicit def tuple15ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](t15: Tuple15[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14]]): Tuple15ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14] = new Tuple15ParallelOps(t15)
  implicit def tuple16ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](t16: Tuple16[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15]]): Tuple16ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15] = new Tuple16ParallelOps(t16)
  implicit def tuple17ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](t17: Tuple17[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16]]): Tuple17ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16] = new Tuple17ParallelOps(t17)
  implicit def tuple18ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](t18: Tuple18[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17]]): Tuple18ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17] = new Tuple18ParallelOps(t18)
  implicit def tuple19ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](t19: Tuple19[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18]]): Tuple19ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18] = new Tuple19ParallelOps(t19)
  implicit def tuple20ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](t20: Tuple20[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19]]): Tuple20ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19] = new Tuple20ParallelOps(t20)
  implicit def tuple21ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](t21: Tuple21[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19], Future[A20]]): Tuple21ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20] = new Tuple21ParallelOps(t21)
  implicit def tuple22ParallelSyntax[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](t22: Tuple22[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19], Future[A20], Future[A21]]): Tuple22ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21] = new Tuple22ParallelOps(t22)
}

final class Tuple1ParallelOps[A0](t1: Tuple1[Future[A0]]) {
  def parMap[Z](f: (A0) => Z)(implicit ec: ExecutionContext): Future[Z] = t1._1.map(f)
}
final class Tuple2ParallelOps[A0, A1](t2: Tuple2[Future[A0], Future[A1]]) {
  def parMapN[Z](f: (A0, A1) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1)] = t2._1.zip(t2._2)
}
final class Tuple3ParallelOps[A0, A1, A2](t3: Tuple3[Future[A0], Future[A1], Future[A2]]) {
  def parMapN[Z](f: (A0, A1, A2) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2)] = t3._1.zip(t3._2).zipWith(t3._3) { case ((a0, a1), a2) => (a0, a1, a2) }
}
final class Tuple4ParallelOps[A0, A1, A2, A3](t4: Tuple4[Future[A0], Future[A1], Future[A2], Future[A3]]) {
  def parMapN[Z](f: (A0, A1, A2, A3) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3)] = t4._1.zip(t4._2).zip(t4._3).zipWith(t4._4) { case (((a0, a1), a2), a3) => (a0, a1, a2, a3) }
}
final class Tuple5ParallelOps[A0, A1, A2, A3, A4](t5: Tuple5[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4)] = t5._1.zip(t5._2).zip(t5._3).zip(t5._4).zipWith(t5._5) { case ((((a0, a1), a2), a3), a4) => (a0, a1, a2, a3, a4) }
}
final class Tuple6ParallelOps[A0, A1, A2, A3, A4, A5](t6: Tuple6[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5)] = t6._1.zip(t6._2).zip(t6._3).zip(t6._4).zip(t6._5).zipWith(t6._6) { case (((((a0, a1), a2), a3), a4), a5) => (a0, a1, a2, a3, a4, a5) }
}
final class Tuple7ParallelOps[A0, A1, A2, A3, A4, A5, A6](t7: Tuple7[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6)] = t7._1.zip(t7._2).zip(t7._3).zip(t7._4).zip(t7._5).zip(t7._6).zipWith(t7._7) { case ((((((a0, a1), a2), a3), a4), a5), a6) => (a0, a1, a2, a3, a4, a5, a6) }
}
final class Tuple8ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7](t8: Tuple8[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7)] = t8._1.zip(t8._2).zip(t8._3).zip(t8._4).zip(t8._5).zip(t8._6).zip(t8._7).zipWith(t8._8) { case (((((((a0, a1), a2), a3), a4), a5), a6), a7) => (a0, a1, a2, a3, a4, a5, a6, a7) }
}
final class Tuple9ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8](t9: Tuple9[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = t9._1.zip(t9._2).zip(t9._3).zip(t9._4).zip(t9._5).zip(t9._6).zip(t9._7).zip(t9._8).zipWith(t9._9) { case ((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8) => (a0, a1, a2, a3, a4, a5, a6, a7, a8) }
}
final class Tuple10ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](t10: Tuple10[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = t10._1.zip(t10._2).zip(t10._3).zip(t10._4).zip(t10._5).zip(t10._6).zip(t10._7).zip(t10._8).zip(t10._9).zipWith(t10._10) { case (((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9) }
}
final class Tuple11ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](t11: Tuple11[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = t11._1.zip(t11._2).zip(t11._3).zip(t11._4).zip(t11._5).zip(t11._6).zip(t11._7).zip(t11._8).zip(t11._9).zip(t11._10).zipWith(t11._11) { case ((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10) }
}
final class Tuple12ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](t12: Tuple12[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = t12._1.zip(t12._2).zip(t12._3).zip(t12._4).zip(t12._5).zip(t12._6).zip(t12._7).zip(t12._8).zip(t12._9).zip(t12._10).zip(t12._11).zipWith(t12._12) { case (((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11) }
}
final class Tuple13ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](t13: Tuple13[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = t13._1.zip(t13._2).zip(t13._3).zip(t13._4).zip(t13._5).zip(t13._6).zip(t13._7).zip(t13._8).zip(t13._9).zip(t13._10).zip(t13._11).zip(t13._12).zipWith(t13._13) { case ((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12) }
}
final class Tuple14ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](t14: Tuple14[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = t14._1.zip(t14._2).zip(t14._3).zip(t14._4).zip(t14._5).zip(t14._6).zip(t14._7).zip(t14._8).zip(t14._9).zip(t14._10).zip(t14._11).zip(t14._12).zip(t14._13).zipWith(t14._14) { case (((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13) }
}
final class Tuple15ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](t15: Tuple15[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = t15._1.zip(t15._2).zip(t15._3).zip(t15._4).zip(t15._5).zip(t15._6).zip(t15._7).zip(t15._8).zip(t15._9).zip(t15._10).zip(t15._11).zip(t15._12).zip(t15._13).zip(t15._14).zipWith(t15._15) { case ((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14) }
}
final class Tuple16ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](t16: Tuple16[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = t16._1.zip(t16._2).zip(t16._3).zip(t16._4).zip(t16._5).zip(t16._6).zip(t16._7).zip(t16._8).zip(t16._9).zip(t16._10).zip(t16._11).zip(t16._12).zip(t16._13).zip(t16._14).zip(t16._15).zipWith(t16._16) { case (((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15) }
}
final class Tuple17ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](t17: Tuple17[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = t17._1.zip(t17._2).zip(t17._3).zip(t17._4).zip(t17._5).zip(t17._6).zip(t17._7).zip(t17._8).zip(t17._9).zip(t17._10).zip(t17._11).zip(t17._12).zip(t17._13).zip(t17._14).zip(t17._15).zip(t17._16).zipWith(t17._17) { case ((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16) }
}
final class Tuple18ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](t18: Tuple18[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = t18._1.zip(t18._2).zip(t18._3).zip(t18._4).zip(t18._5).zip(t18._6).zip(t18._7).zip(t18._8).zip(t18._9).zip(t18._10).zip(t18._11).zip(t18._12).zip(t18._13).zip(t18._14).zip(t18._15).zip(t18._16).zip(t18._17).zipWith(t18._18) { case (((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16), a17) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17) }
}
final class Tuple19ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](t19: Tuple19[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = t19._1.zip(t19._2).zip(t19._3).zip(t19._4).zip(t19._5).zip(t19._6).zip(t19._7).zip(t19._8).zip(t19._9).zip(t19._10).zip(t19._11).zip(t19._12).zip(t19._13).zip(t19._14).zip(t19._15).zip(t19._16).zip(t19._17).zip(t19._18).zipWith(t19._19) { case ((((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16), a17), a18) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18) }
}
final class Tuple20ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](t20: Tuple20[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = t20._1.zip(t20._2).zip(t20._3).zip(t20._4).zip(t20._5).zip(t20._6).zip(t20._7).zip(t20._8).zip(t20._9).zip(t20._10).zip(t20._11).zip(t20._12).zip(t20._13).zip(t20._14).zip(t20._15).zip(t20._16).zip(t20._17).zip(t20._18).zip(t20._19).zipWith(t20._20) { case (((((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16), a17), a18), a19) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19) }
}
final class Tuple21ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](t21: Tuple21[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19], Future[A20]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = t21._1.zip(t21._2).zip(t21._3).zip(t21._4).zip(t21._5).zip(t21._6).zip(t21._7).zip(t21._8).zip(t21._9).zip(t21._10).zip(t21._11).zip(t21._12).zip(t21._13).zip(t21._14).zip(t21._15).zip(t21._16).zip(t21._17).zip(t21._18).zip(t21._19).zip(t21._20).zipWith(t21._21) { case ((((((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16), a17), a18), a19), a20) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20) }
}
final class Tuple22ParallelOps[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](t22: Tuple22[Future[A0], Future[A1], Future[A2], Future[A3], Future[A4], Future[A5], Future[A6], Future[A7], Future[A8], Future[A9], Future[A10], Future[A11], Future[A12], Future[A13], Future[A14], Future[A15], Future[A16], Future[A17], Future[A18], Future[A19], Future[A20], Future[A21]]) {
  def parMapN[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z)(implicit ec: ExecutionContext): Future[Z] = parTupled.map(f.tupled)
  def parTupled(implicit ec: ExecutionContext): Future[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = t22._1.zip(t22._2).zip(t22._3).zip(t22._4).zip(t22._5).zip(t22._6).zip(t22._7).zip(t22._8).zip(t22._9).zip(t22._10).zip(t22._11).zip(t22._12).zip(t22._13).zip(t22._14).zip(t22._15).zip(t22._16).zip(t22._17).zip(t22._18).zip(t22._19).zip(t22._20).zip(t22._21).zipWith(t22._22) { case (((((((((((((((((((((a0, a1), a2), a3), a4), a5), a6), a7), a8), a9), a10), a11), a12), a13), a14), a15), a16), a17), a18), a19), a20), a21) => (a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21) }
}