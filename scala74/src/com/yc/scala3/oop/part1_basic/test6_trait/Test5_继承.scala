package com.yc.scala3.oop.part1_basic.test6_trait

//继承
object Test5_继承 {


    def main(args: Array[String]): Unit = {
      val l = new Location(1, 2, 3)
      l.move(1, 2)
      l.move(1, 2, 3)
      l.distance()
    }
     //抽象类        主构造器
    abstract class Point(xc : Int, yc: Int) {
      var x: Int = xc
      var y: Int = yc

      def move(dx: Int, dy: Int) {
        x = x + dx
        y = y + dy
        println("x 的坐标点: " + x);
        println("y 的坐标点: " + y);
      }

      def distance();   //抽象类中的抽象方法可以不用标识abstract
    }

    //只有子类中的主构造函数才可以向基类的构造函数里写参数
    class Location(var xc: Int, var yc: Int, val zc: Int) extends Point(xc, yc) {

      var z: Int = zc
       //重载方法
      def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx
        y = y + dy
        z = z + dz
        println("x 的坐标点 : " + x);
        println("y 的坐标点 : " + y);
        println("z 的坐标点 : " + z);
      }

      //重写父类的非抽象方法要加入override关键字
      override def move(dx: Int, dy: Int): Unit = {
        println("重写了父类的move(非abstract的方法),要加入override")
        super.move(dx, dy)
      }

      def distance(): Unit = {
        println("重写了父类的抽象方法时，不用加 override")
      }
    }
  }
