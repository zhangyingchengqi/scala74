package com.yc.scala2.collection

object Test11_map extends App {
  // 空哈希表，键为字符串，值为整型
  var A: Map[Char, Int] = Map()
  // Map 键值对演示
  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

  //添加 key-value 对，可以使用 + 号，
  A += ('I' -> 1)
  A += ('J' -> 5)
  A += ('K' -> 10)
  A += ('L' -> 100)
  A.foreach(println)
  colors.foreach(println)

  //map常见方法   keys   values  isEmpty
  println("colors 中的键为 : " + colors.keys)
  println("colors 中的值为 : " + colors.values)
  println("检测 colors 是否为空 : " + colors.isEmpty)

  //使用 ++ 运算符或 Map.++() 方法来连接两个 Map，Map 合并时会移除重复的 key
  val colors1 = Map("red" -> "#FF0000",
    "azure" -> "#F0FFFF",
    "peru" -> "#CD853F")
  val colors2 = Map("blue" -> "#0033FF",
    "yellow" -> "#FFFF00",
    "red" -> "#FF0000")
  //  ++ 作为运算符
  var result = colors1 ++ colors2
  println("colors1 ++ colors2 : " + result)
  //  ++ 作为方法
  result = colors1.++(colors2)
  println("colors1.++(colors2) : " + result)

  //输出 Map 的 keys 和 values
  val sites = Map("jd" -> "http://www.jd.com",
    "baidu" -> "http://www.baidu.com",
    "taobao" -> "http://www.taobao.com")
  sites.keys.foreach { i =>
    println("Key = " + i)
    println(" Value = " + sites(i))
  }

  //Map.contains 方法来查看 Map 中是否存在指定的 Key
  if (sites.contains("jd")) {
    println("jd 键存在，对应的值为 :" + sites("jd"))
  } else {
    println("jd 键不存在")
  }
  if (sites.contains("baidu")) {
    println("baidu 键存在，对应的值为 :" + sites("baidu"))
  } else {
    println("baidu 键不存在")
  }
  if (sites.contains("google")) {
    println("google 键存在，对应的值为 :" + sites("google"))
  } else {
    println("google 键不存在")
  }
}
