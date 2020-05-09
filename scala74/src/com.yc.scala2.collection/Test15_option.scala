package com.yc.scala2.collection

object Test15_option  {
  //通过模式匹配来输出匹配值。
  def main(args: Array[String]) {
    // scala.collection.Map
    val sites = Map("baidu" -> "www.baudi.com", "google" -> "www.google.com")

    println("show(sites.get( \"baidu\")) : " + show(sites.get("baidu")))     //    内置这个Map的get 返回值   def get(key: K): Option[V]
    println("show(sites.get( \"bidu\")) : " + show(sites.get("bidu")))
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"    // java返回值为null
  }
}
