package com.yc.scala3.oop.part2_advanced

object Test4_上界 extends App{
  val cp=new Pair[Integer]( 1,2 )  //java风格   Integer.valueOf(  1 )
  println(   cp.smaller  )


}

//函数柯里化
class Pair[T<:Comparable[T]]( val first:T,  val second:T  ){
  def smaller=if( first.compareTo(second)<0) first else second
}


//  Comparable接口，并没有做实现。

// 1       转成   Comparable的子类(  Integer  )  ?
// implicit
