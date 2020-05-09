package com.yc.scala3.oop.part1_basic.test6_trait

object Test9_match_datatype extends App {

  for (obj <- Array(42, "42", BigInt(42), BigInt, 42.0)) {   //注意，这里的Array中的数据类型不一样

    val result = obj match {    //根据类型
      case x: Int => x
      case s: String => s.toInt
      case _: BigInt => Int.MaxValue    //   _代表当前的变量
      case BigInt => -1
      case _ => 0
    }

    println(result)
  }

  for (obj <- Array(     Map("Fred" -> 42), Map(42 -> "Fred"), Array(42), Array("Fred"))) {

    val result = obj match {
      case m: Map[String, Int] => "It's a Map[String, Int]"
      // Warning: Won't work because of type erasure            non-variable type argument String in type pattern scala.collection.immutable.Map[String,Int] (the underlying of Map[String,Int]) is unchecked since it is eliminated by erasure
      case m: Map[_, _] => "It's a map"     //   _ 代表所有的数据类型
      case a: Array[Int] => "It's an Array[Int]"
      case a: Array[_] => "It's an array of something other than Int"
    }

    println(result)
  }

}
