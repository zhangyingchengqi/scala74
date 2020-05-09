package com.yc.scala2.collection

object Test7_list extends App{
  // 创建列表
  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
  days.foreach( println )
  // final override def foreach[U](f: A => U): Unit

  //创建空列表
  val l = Nil
  println(  l )

  val l2 = List()
  println(   l2 )

  //用字符串创建列表
  val l3 = "Hello" :: "Hi" :: "Hah" :: "WOW" :: "WOOW" :: Nil
  l3.foreach( println )

  // 用“:::”叠加创建新列表
  println()
  val l4 = l3 ::: ( List("WOOOW", "WOOOOW") )      //   新的list前  l3后
  val l5 = l3 .::: ( List("WOOOW", "WOOOOW") )    // l3前,新list后
  l4.foreach(   println )

  // 通过索引获取列表值
  println(  "\n"+ l4(3) )

  // 获取值长度为3的元素数目
  println( l4.count( s => s.length == 3 ) )
  // def count(p: A => Boolean): Int

  // 返回去掉l4头两个元素的新列表
  println(   l4.drop(2) )
  // override def drop(n: Int): C
  println(  "注意l4本身没变")
  l4.foreach(  println )

  // 返回去掉l后两个元素的新列表
  println(    l4.dropRight( 2) )

  // 判断l是否存在某个元素
  println(  l4.exists(s => s == "Hah") )
  // final override def exists(p: A => Boolean): Boolean

  //滤出长度为3的元素
  println(  l4.filter(s => s.length == 3) )
  // override def filter(p: A => Boolean): List[A]

  // 判断所有元素是否以“H”打头
  println(   l4.forall(s => s.startsWith("H")) )

  // 判断所有元素是否以“W”结尾
  println(   l4.forall(s => s.endsWith("W")) )

  // 打印每个元素
  l4.foreach(s => println(s + ' '))
  l4.foreach(   println )
  println()

  // 取出第一个元素
  println(  l4.head )

  //取出最后一个元素
  println(  l4.last )

  //剔除最后一个元素，生成新列表
  println(   l4.init )

  // 剔除第一个元素，生成新列表
  println(   l4.tail  )

  //判断列表是否为空
  println(  l4.isEmpty )

  // 获得列表长度
  println(  l4.length )

  // 修改每个元素，再反转每个元素形成新列表
  println(    l4.map(s => {  val s1 = s + " - 01"; s1.reverse  }    ))

  // 生成用逗号隔开的字符串
  println(  l4.mkString("; ") )

  // 反序生成新列表
  println(  l4.reverse )

  //按字母递增排序
  println(  l4.sortWith(   _.compareTo(_) < 0) )    //   _表示第一个元素     _表示第二个元素
  //println(  l4.sortWith(   _._2.compareTo(_._2) < 0) )


  //tabulate() 通过给定的函数来创建列表
  val squares = List.tabulate(6)(n => n * n)
  println( "一维 : " + squares  )
  //        创建二维列表
  val mul = List.tabulate( 4,5 )( _ * _ )
  println( "多维 : " + mul  )

  //List.fill() 方法来创建一个指定重复数量的元素列表
  val site = List.fill(3)("abc") // 重复 abc 3次
  println( "  " + site  )
  val num = List.fill(10)(2)         // 重复元素 2, 10 次
  println( "num : " + num  )

}
