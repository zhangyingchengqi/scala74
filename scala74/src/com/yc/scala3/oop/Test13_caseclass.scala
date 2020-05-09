package com.yc.scala3.oop



abstract class Amount

//样例类:  底层优化,  serializable
// 类： 构造方法,可以初始化参数,   参数的getter, setter
//    value是val修饰
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, u: String) extends Amount

case object Nothing extends Amount

object Test13_caseclass extends App{



  //样例类主要用于模式匹配
    //     样例类的对象     Dollar(1000.0) 伴生对象  apply, toString, hashcode, unapply
  ///
    for (amt <- Array(   Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
      val result = amt match {
        case Dollar(v) => "$" + v         //提取器将对象的参数提取出来存到变量中。
        case Currency(v, u) => s"$u$v"
        case Nothing => ""
      }
      println(amt + ": " + result)
  }

}
/*
   Dollar的样例类反编译后的结果:   javap    xxxx
   public class com.yc.scala3.oop.Dollar extends com.yc.scala3.oop.Amount implements scala.Product,java.io.Serializable {
        public static scala.Option<java.lang.Object> unapply(com.yc.scala3.oop.Dollar);
        public static com.yc.scala3.oop.Dollar apply(double);
        public static <A> scala.Function1<java.lang.Object, A> andThen(scala.Function1<com.yc.scala3.oop.Dollar, A>);
     public static <A> scala.Function1<A, com.yc.scala3.oop.Dollar> compose(scala.Function1<A, java.lang.Object>);
       public scala.collection.Iterator<java.lang.String> productElementNames();
       public double value();
       public com.yc.scala3.oop.Dollar copy(double);
        public double copy$default$1();
        public java.lang.String productPrefix();
       public int productArity();
     public java.lang.Object productElement(int);
     public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public java.lang.String productElementName(int);
              public int hashCode();
              public java.lang.String toString();
             public boolean equals(java.lang.Object);
          public com.yc.scala3.oop.Dollar(double);
}


 */
