package com.yc.scala3.oop.part1_basic.test6_trait

object Test9_match extends App{
  var sign = 0
  for (ch <-   "+-!"   ) {  //循环字符串，每次取一个字符
    //匹配字符的值
    ch match {
      case '+' => sign = 1
      case '-' => sign = -1
      case _ => sign = 0       //相当于   default  ,前面的条件都不满足时调用
    }
    println(sign)
  }

  for (ch <- "+-!") {
    sign = ch match {
      case '+' => 1
      case '-' => -1
      case _ => 0
    }
    println(sign)
  }


  import java.awt._    //  原生的java中的

  val color = SystemColor.textText     //取出系统中文本的color
  val a=color match {
    case Color.RED => "Text is red"
    case Color.BLACK => "Text is black"
    case _ => "Not red or black"
  }
  println( a )
}
