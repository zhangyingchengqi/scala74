package com.yc.scala3.oop.part1_basic.test6_trait

object Test8_提取器 extends App {

  val author = "Cay John"
  val Name(first, flast) = author   //提取器:将传入的参数自动拆包       apply的反向操作       List(1,2,4)->  List(1,2,3)

  println(first + " -- " + flast)

}


object Name {
  //当调用  Name()  ,由scala编译器回调这个 unapply的方法,将传进来的参数交  input

  //option一个对象。   Some[值]       None
  def unapply(input: String) = {
    val pos = input.indexOf(" ")
    if (pos == -1)
      None
    else
      Some(     (input.substring(0, pos)), input.substring(pos + 1)      )  //   "Cay"  "John"
  }

}
