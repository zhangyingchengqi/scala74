package com.yc.scala3.oop.part1_basic.test6_trait

object Test12_match_guard extends App {
  for (ch <- "+-3!") {
    var sign = 0
    var digit = 0

    ch match {
      case '+' => sign = 1
      case '-' => sign = -1
        //    guard:    boolean 表达式   表示再多一层的判断
      case _ if Character.isDigit(ch) =>       digit = Character.digit(ch, 10)
      case _ => sign = 0
    }

    println(ch + " " + sign + " " + digit)
  }
}
