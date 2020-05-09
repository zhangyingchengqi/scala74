package com.yc.scala2.collection

object Test9_set_mutable extends App {

  import scala.collection.mutable.Set

  val mutableSet = Set(1, 2, 3)
  println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet
  mutableSet.add(4)
  mutableSet.remove(1)
  mutableSet += 5
  mutableSet -= 2
  println(mutableSet) // Set(5, 3, 4)
  val another = mutableSet.toSet   //转类型
  println(another.getClass.getName) // scala.collection.immutable.Set


}
