package com.yc.scala2.collection

object Test5_list extends App {
  val digits = List(4, 2)   //伴生对象    apply()
  //  scala.collection.List  ->
  // type List[+A] = scala.collection.immutable.List[A]
  //

  9 :: List(4, 2) //::操作符从给定的头和尾进行创建

  9 :: 4 :: 2 :: Nil //::是右结合，列表将从末端构建

  9 :: (4 :: (2 :: Nil)) //以上相当于左边

  def sum1(lst: List[Int]): Int =
    if (lst == Nil) 0 else lst.head + sum1(lst.tail)   //递归调用  sum1以计算list的后面的列表

  sum1(   List(9, 4, 2)    )

  //上面的函数也可写成以下
  def sum2(lst: List[Int]): Int = lst match {
    case Nil => 0
    case h :: t => h + sum2(t) // h is lst.head, t is lst.tail      在模式匹配中的对象提取器
         //它会自动地将  lst 中的元素提取出来
  }

  sum2(List(9, 4, 2))

  //每个集合中都有聚合函数
  List(9, 4, 2).sum // 以上其实也可以直接调用  sum完成
}
