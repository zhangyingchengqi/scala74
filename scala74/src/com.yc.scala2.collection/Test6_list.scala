package com.yc.scala2.collection

object Test6_list extends App{
  val list=List(1,2,3,10,3,6)

  // 排序
  list.sorted
  // override def sorted[B >: A](implicit ord: scala.Ordering[B]): C


  list.sortBy( t => -t )


  val wds=List( ("zy",20),("lisi",30) )


  wds.sortBy(   t =>  t._2 )

  wds.sortBy(   t =>  -t._2 )
  // def sortBy[B](f: A => B)(implicit ord: scala.Ordering[B]): C


  wds.sortWith(  (x,y) =>  x._2<y._2      )


  list.grouped(2)

  list.fold(10)( (a,b)=>  a-b  )





}
