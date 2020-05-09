package com.yc.scala2.collection

object Test10_set extends App {

  // head, tail ,isEmpty
  val fruit = Set("apples", "oranges", "pears")   // immutable
  val nums: Set[Int] = Set()
  println("Head of fruit : " + fruit.head)
  println("Tail of fruit : " + fruit.tail)
  println("Check if fruit is empty : " + fruit.isEmpty)
  println("Check if nums is empty : " + nums.isEmpty)

  //++运算符或Set.++()   连结多个集合，并去除重复元素
  val fruit1 = Set("apples", "oranges", "pears")
  val fruit2 = Set("mangoes", "banana")
  var fruit3 = fruit1 ++ fruit2
  println("fruit1 ++ fruit2 : " + fruit3)
  fruit3 = fruit1.++(fruit2)
  println("fruit1.++(fruit2) : " + fruit3)

  //Set.min方法和Set.max
  val num = Set(5, 6, 9, 20, 30, 45)
  println("Min element in Set(5,6,9,20,30,45) : " + num.min)
  println("Max element in Set(5,6,9,20,30,45) : " + num.max)

  //Set.＆或Set.intersect   交集
  val num1 = Set(5, 6, 9, 20, 30, 45)
  val num2 = Set(50, 60, 9, 20, 35, 55)
  println("num1.&(num2) : " + num1.&(num2))
  println("num1.intersect(num2) : " + num1.intersect(num2))

  // union    subtract

  val numbers=collection.immutable.SortedSet(1, 2, 3, 4, 5, 6,10,8)

}
