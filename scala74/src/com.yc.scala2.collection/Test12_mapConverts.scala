package com.yc.scala2.collection

object Test12_mapConverts extends App{

  import scala.collection.JavaConverters._

  //  Map<String, String>
  val ids = java.time.ZoneId.SHORT_IDS.asScala    //asScala转Scala 类型

  //  Properties
  val props = System.getProperties().asScala

  import java.awt.font.TextAttribute._

  val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
  val font = new java.awt.Font(attrs.asJava)    // asJava 转java类型


  val t = new Tuple3(1, 3.14, "Fred")

}
