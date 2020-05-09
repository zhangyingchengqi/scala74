package com.yc.scala2.collection

object Test8_set extends App{
  val set = Set(1,2,3)
  println(set.getClass.getName) //

  println(set.exists(_ % 2 == 0)) //true
  println(set.drop(1)) //Set(2,3)

  println(   set  )
}
