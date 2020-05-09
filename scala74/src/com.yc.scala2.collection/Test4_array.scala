package com.yc.scala2.collection

object Test4_array extends App {
  //数组的定义，一个固定长度的数组，长度可变，内容可变
  var x: Array[String] = new Array[String](3)
  var y = new Array[String](3)

  //定义定长数组， 长度不可变，内容可变
  val z = Array(1, 2, 3)   //伴生类对象的apply()
  //修改第0个元素的内容
  z(0) = 100

  val array = Array[Int](2, 4, 6, 9, 3)
  //map()：  高阶函数    参数是另一个函数
  val result = array.map(x => x * 2)
  // def map[B](f: A => B)(implicit ct: ClassTag[B]): Array[B]
  for (i <- result) {
    println(i)
  }
  //也可以写成
  val result2 = array.map(_ * 2)
  for (i <- result2) {
    println(i)
  }

  println("==========")
  val words = Array("hello world hello mike", "hello china")
  val splitWords: Array[Array[String]] = words.map(wd => wd.split(" "))
  for (i <- splitWords) {
    for (j <- i) {
      println(j)
    }
  }

  println("======展平数组=====")
  val flattenWords = splitWords.flatten
  // def flatten[B](implicit asIterable: A => IterableOnce[B],m: ClassTag[B]): Array[B]
  for (i <- flattenWords) {
    println(i)
  }

  println("====以上两个操作可以用一个操作代替=====")
  val result3: Array[String] = words.flatMap(wd => wd.split(" "))
  // def flatMap[BS, B](f: A => BS)(implicit asIterable: BS => Iterable[B],m: ClassTag[B]): Array[B]
  result3.foreach(println)
}
