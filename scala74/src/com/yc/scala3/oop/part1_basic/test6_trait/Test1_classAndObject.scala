package com.yc.scala3.oop.part1_basic.test6_trait

//1. java中带main方法的类名与文件名相同，但scala不要


//声明类与对象
object Test1 {
  def main(args: Array[String]): Unit = {
    val pt = new Point(10, 20)

    // 移到一个新的位置
    pt.move(10,10)

    pt.x=200

    pt.move(100,200)
  }
}


// scala 定义类可以初始化参数
//主构造器    ,还有在类中用   def this()   辅助构造方法
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var  y: Int = yc        //var修饰的属性,表示是一个变量，可更改，相当于提供了  getter和setter方法

  // 如  val修饰的话，则相当于提供了  getter方法.
  var distance:Int= _

  def move(dx: Int, dy: Int) {   //方法
    x = x + dx
    y = y + dy
    distance=x+y
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
    println("距离:"+ distance)
  }
}

