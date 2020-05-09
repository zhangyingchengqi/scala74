package com.yc.scala2.collection

// scala,   Predef  ,  java.lang

object Test1_appy extends App {
  //集合中每个类都有一个伴生类对象，它里面有一个appy()方法

  import java.awt.Color

  Iterable(0xFF, 0xFF00, 0xFF0000)

  Set(Color.RED, Color.GREEN, Color.BLUE)
  Map(Color.RED -> 0xFF0000, Color.GREEN -> 0xFF00, Color.BLUE -> 0xFF)
  //  默认情况下导入三个包，这个Map是  Predef包下的一个别名
  /// type Map[K, +V] = immutable.Map[K, V]
  // apply(xxx ,xxxx)


  import scala.collection._

  SortedSet("Hello", "World")

}
