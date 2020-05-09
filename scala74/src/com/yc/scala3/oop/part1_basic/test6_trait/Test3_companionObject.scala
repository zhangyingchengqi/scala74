package com.yc.scala3.oop.part1_basic.test6_trait

//类
//主构造方法无参
class Dog {
  val id = 1
  private var name = "小猪猪"    //私有成员

  //方法     Unit 无返回值
  def printName(): Unit = {
    //在Dog类中可以访问伴生对象Dog的私有属性
    println(this.name + "我想挣好多好多钱")
  }
}

/*伴生对象:在同一个文件中，object的名字与class一样
     它是一个静态类
 */
object Dog {
  //伴生对象中的私有属性
  private val CONSTANT = "汪汪汪"

  def main(args: Array[String]): Unit = {
    val p = new Dog      //调用的是  class Dog
    //访问私有字段name
    p.name = "小傻子"    // 在伴生对象中可以访问主对象的私有成员
    p.printName()


    //请注意:   Dao这个例是不能  new的，因为它是单例对象，它里面的所有成员都是  static的
    println(   Dog.CONSTANT   )
    //println(  Dog.id )  //错误,只能用对象名调用.
  }
}



