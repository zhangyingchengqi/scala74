package com.yc.scala2.collection

object Test2_to extends App {

  import scala.collection.mutable.ArrayBuffer

  val coll = Seq(1, 1, 1, 2, 3, 4)
  val set = coll.toSet
  val array = coll.toArray
  val vector = coll.toVector

}
