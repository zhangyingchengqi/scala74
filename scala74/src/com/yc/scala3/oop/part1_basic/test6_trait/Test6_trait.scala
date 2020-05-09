package com.yc.scala3.oop.part1_basic.test6_trait

import java.io.PrintWriter   //字符输出流

//特质:类似于一个接口
trait Logger {
  def log(msg: String)     //抽象方法: 不写 abstract
}

//特质不能有构造器参数
trait FileLogger extends com.yc.scala3.oop.part1_basic.test6_trait.Logger {
  val filename: String
  val out = new PrintWriter(filename)
  println("FileLogger")

  def log(msg: String) { out.println(msg); out.flush() }    //不需要  override
}

// 使用lazy来修饰  out
trait FileLogger2 extends com.yc.scala3.oop.part1_basic.test6_trait.Logger {
  val filename: String
  lazy val out = new PrintWriter(filename)      //  lazy
  def log(msg: String) { out.println(msg); out.flush() }
}

class Account {
  protected var balance = 0.0
}

abstract class SavingsAccount extends Account with com.yc.scala3.oop.part1_basic.test6_trait.Logger {      //这个类为什么要  abstract呢?因为它继承了  Logger特质，但没有实现特质中的抽象方法
  println("SavingsAccount")
  def withdraw(amount: Double) {
    if (amount > balance)
      log("金额不足")
    else
      balance -= amount
  }
}

object Main extends App {
  // 第一种方案: 提前定义发生在常规的构造序列之前,接着才执行 FileLogger的构造方法，此时filename有值了，out才能创建.
  val acct = new {
    val filename = "myapp.log"
  } with com.yc.scala3.oop.part1_basic.test6_trait.SavingsAccount with FileLogger      //        filename="xxx"     -> FileLogger   -> SavingsAccount
  acct.withdraw(100)

  //第二种方案: 在FileLogger2中 out上加入lazy,这样，out字段直到初次被使用时才会完成实始化.
  val acct2 = new com.yc.scala3.oop.part1_basic.test6_trait.SavingsAccount with FileLogger2 {
    val filename = "myapp2.log"
  }
  acct2.withdraw(100)
  println("Look into myapp.log and myapp2.log for the log messages.");
}

