package com.yc.scala2.collection

object Test13_tuple extends App {
  //元组定义及访问
  val t = (4,3,2,1)
  val sum = t._1 + t._2 + t._3 + t._4
  println( "元素之和为: "  + sum )


  //Tuple.productIterator() 方法来迭代输出元组的所有元素
  t.productIterator.foreach{ i =>println("Value = " + i )}

  //输出元组值
  val t1: (String, Int) = ("scala",1)
  println(s"key:${t1._1}  value:${t1._2}")

  //元组的嵌套
  val tuple2: (Int, (String, Double)) = (   15,   ("hadoop",1.2)    )
  println(s"外层的key:${tuple2._1}  内层的key:${tuple2._2._1}  value:${tuple2._2._2}")
}


//模式匹配
