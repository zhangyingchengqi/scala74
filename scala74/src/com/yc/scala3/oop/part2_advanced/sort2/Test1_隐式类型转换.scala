package com.yc.scala3.oop.part2_advanced.sort2

object Test1_隐式类型转换 extends App {

  /*
  结合隐式类型转换并结合   Ordered(相当于java中的   Comparable接口  ) 来完成
   */

  //比较器
  class Cmp2[T](o1: T, o2: T)(implicit ev: T => Ordered[T]) { // implicit ev:T=> Ordered[T]   这表明参数 T 都可以隐式转换为  Ordered对象
    def bigger = if (o1 > o2) o1 else o2 //  Ordered对象中定义了  >   <   >=   <=  等比较操作符
  }

  class Student2(val name: String, val age: Int) {
    override def toString: String = this.name + "\t" + this.age
  }

  //隐式类型转换: 隐式转换是带有单个参数的函数，它会被自动应用，将值从一种类型转为另一种类型.
  implicit def student2Ordered(s: Student2) = new Ordered[Student2] {
    override def compare(that: Student2): Int = s.age - that.age
  }

  val s1 = new Student2("张三", 20)
  val s2 = new Student2("李四", 30)

  val c = new Cmp2(s1, s2)
  println(c.bigger)
}
