package com.yc.scala2.collection

object Test14_option {

  //如下如果分母为零会抛出异常,如果不想抛出异常中断程序该怎么处理??
  def div(a:Int, b:Int) : Int ={
    a/b
  }

  def main(args: Array[String]): Unit = {
    println(div(10,5))
    //println(div(10,0))      //抛异常

    //Option类型在Scala中用来表示一个结果，它可能有值，也可能没有值，它有两个子类Some表示有值，None表示没有值
    println(  div2(10,5))
    println(  div2(10,0) )


    //但是返回值要么是Some对象要么是None对象,没法处理怎么办??    用到 提取器
    val x1=div2(10,5).getOrElse(0)
    println( x1 )
    val x2=div2(10,0).getOrElse(0)
    println( x2 )
  }


  //Option类型在Scala中用来表示一个结果，它可能有值，也可能没有值，它有两个子类Some表示有值，None表示没有值
  def div2(a: Int, b: Int): Option[Int] = {
    if (b != 0) Some(a / b) else None
  }
}
