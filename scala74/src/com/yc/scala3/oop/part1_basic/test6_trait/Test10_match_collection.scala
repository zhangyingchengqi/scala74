package com.yc.scala3.oop.part1_basic.test6_trait

object Test10_match_collection extends App {
  for (arr <- Array(    Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0))   ) {

    val result = arr match {
      case Array(0) => "0"
      case Array(x, y) => x + " " + y
      case Array(0, _*) => "0 ..."
      case _ => "something else"
    }

    println(result)
  }

  for (lst <- Array(  List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {

    val result = lst match {
      case 0 :: Nil => "0"         //   0::Nil 指的是   List(0)  head 0 +tail  Nil
      case x :: y :: Nil => x + " " + y
      case 0 :: tail => "0 ..."
      case _ => "something else"
    }

    println(result)
  }

  for (pair <- Array(  (0, 1), (1, 0), (1, 1)  )     ) {
    val result = pair match {
      case (0, _) => "0 ..."
      case (y, 0) => y + " 0"
      case _ => "neither is 0"
    }

    println(result)
  }

}
