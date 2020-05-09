package com.yc.scala3.oop.part1_basic.test6_trait

object Test3_apply {

  def apply(name: String) = {
    println("hello" + name)
  }

  def main(args: Array[String]): Unit = {

    List(1,2,3)

    Test3_apply.apply("lisi")

    Test3_apply("zy")  //   scala  调用  Test3_apply中的apply
  }
}
