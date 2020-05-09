package com.yc.scala3.oop.part2_advanced.sort4

object Test1_  extends App{
  /*
  结合隐式类型转换并结合   Ordering(相当于java中的   Comparator接口  ) 来完成
   */

  //比较器
  //这里用到了  [T:M],这叫上下文界定，它要求必须存在一个类型为 M[T]的隐式值
  class Cmp3[T: Ordering](o1: T, o2: T) { // implicit cmptor:Ordering[T]  这表明参数 cmptor 是一个 Ordering[T]的对象
    def bigger = {
      val cmptor=implicitly[Ordering[T]]
      if( cmptor.compare(o1,o2)>0) o1 else o2
    }
  }

  class Student3(val name: String, val age: Int) {
    override def toString: String = this.name + "\t" + this.age
  }

    //方案一: 隐式类型转换: 隐式转换是带有单个参数的函数，它会被自动应用，将值从一种类型转为另一种类型.
    //这样解决的话，是从下面  Cmp3调用时传的参数着手解决的，进行类型转换
    //    implicit def student3Ordered(s: Student3) = new Ordered[Student3] {
    //      override def compare(that: Student3): Int = s.age - that.age
    //    }

    //方案二: 这是一个隐式对象 用于传入到 上面  Cmp3中的隐式参数中
    implicit val comparatorStu = new Ordering[Student3] {
      override def compare(x: Student3, y: Student3): Int = x.age - y.age
    }

    val s1 = new Student3("张三", 20)
    val s2 = new Student3("李四", 30)

    val c = new Cmp3(s1, s2)
    println(c.bigger)
}
