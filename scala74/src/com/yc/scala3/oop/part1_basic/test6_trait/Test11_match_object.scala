package com.yc.scala3.oop.part1_basic.test6_trait

object Test11_match_object extends App {

  //样例对象
  case class A(id: String, name: String, age: Int)

  //样例对象:
  // 标识接口    java.io.Serializable   没有抽象方法
  //  class x implements Serializable{}
  //    x a=new x();   if(   a instanceof Serializable  ){
  //            序列化到磁盘.   hadoop
  //    }
  case class B(id: String, name: String, age: Int)


  objMatch(A)

  //         Any:
  //   AnyRef            AnyVal
  //  Array              Int  Double
  def objMatch(obj: Any) = obj match {
    case A => println("A")
    case B => println("B")
    case _ => println("error")
  }
}
