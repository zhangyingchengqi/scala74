package com.yc.scala3.oop.part2_advanced

import java.io.{BufferedReader, File, FileReader}
import scala.io.Source

object Test10_implicit_file extends App {

  //定义类型： scala类型    主构造方法  java.io.File
  implicit class RicherFile(val file: File) {
    //增加读取方法
    def read = Source.fromFile(file.getPath).mkString

    //增加计行数方法≠+
    def count(): Int = {
      val fileReader = new FileReader(file)   //文件输入字符流
      val bufferedReader = new BufferedReader(fileReader)   //缓冲字符流     可以一行一行的读   readLine()
      var sum = 0
      var line: String = bufferedReader.readLine()
      try {
        while (line != null) {
          sum += 1
          line = bufferedReader.readLine()
        }
      } catch {
        case _: Exception => sum
      } finally {
        fileReader.close()
        bufferedReader.close()
      }
      sum      //行数
    }
  }

  val file = new File("/Applications/apache-tomcat-8.0.30/logs/localhost_access_log.2018-12-22.txt")
  println(file.read)
  println(file.count())

}
