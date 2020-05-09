package com.yc.scala3.oop.part2_advanced.sort1

object Test1_比较 extends App {

  class Cmp[T <: Comparable[T]](o1: T, o2: T) {
    def bigger = if (o1.compareTo(o2) > 0) o1 else o2
    //  T 是一个 Student  ->  Ordered
    //  ->   compareTo   ->  compare
  }

  //类似于java的写法   Comparable接口对应  Ordered
  // trait Ordered[A] extends Any with java.lang.Comparable[A]   compareTo(  T )
  //   scala 符号   >   <  ...
  class Student(val name: String, val age: Int) extends Ordered[Student] {
    override def compare(that: Student): Int = this.age - that.age

    override def toString: String = this.name + "\t" + this.age
  }

  val s1 = new Student("张三", 20)
  val s2 = new Student("李四", 30)

  val c = new Cmp(s1, s2)
  println(c.bigger)
}
