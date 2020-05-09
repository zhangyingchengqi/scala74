package com.yc.scala2.collection

object Test16_iterator extends App {

  /*
     java:    Collection    Map
     Iterator its=set.iterator()
     while(  its.hasNext() ){
          its.next();
     }
   */
  val coll = Array(1, 7, 2, 9)
  val iter = coll.iterator
  while (  iter.hasNext     )
    println(   iter.next()    )


  coll.foreach(println)

}
