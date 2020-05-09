package com.yc.scala3.oop.part1_basic.test6_trait

class Person { //主构造方法没有参数
  private var name = ""
  private var age = 0

  //辅助构造方法
  def this(name: String) {
    this() //在辅助构造方法的第一句要调用主构造器
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

  /*
    public   String toString(){    }
   */

  override def toString: String = this.name + "\t" + this.age
}

object Test1_constructor {
  def main(args: Array[String]): Unit = {
    var p1 = new Person
    var p2 = new Person("zy")
    var p3 = new Person("zy", 20)


    println(p1)
    println(p2)
    println(p3)
  }
}
