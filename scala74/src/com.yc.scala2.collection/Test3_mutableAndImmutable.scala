package com.yc.scala2.collection

// scala是隐式导入

object Test3_mutableAndImmutable extends App{

  val immutableMap: collection.immutable.Map[String, Int] = collection.immutable.Map("Hello" -> 42) // 不可变集合
  val mutableMap = new collection.mutable.HashMap[String, Int] //可变

  //父类引用指向子类对象
  val map: collection.Map[String, Int] = mutableMap

  mutableMap.put("Wilma", 17)
  //map.put("Fred", 29) // 错误 ,  因为当前这个map是   collection.Map,它里面没有修改的方法.

  /*
             collection.Map   没有修改方法
      collection.immutable.Map (没有修改方法)     collection.mutable.Map
  */


}
