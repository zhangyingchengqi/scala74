package com.yc.scala3.oop.part2_advanced

object Test3_泛型基础 extends App{

  println(   new IntMessage[Int](1)   )
  println(  new StringMessage[String]("1"))   //措升程序编译时的安全性



}

//泛型:就是类型约束
abstract class Message[T](content: T)

class StringMessage[String](content: String) extends Message[String](content)

class IntMessage[Int](content: Int) extends Message[Int](content)

