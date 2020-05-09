package com.yc.akka.test2

import akka.actor.Actor

//在一个jvm中创建一个actorsystem,创建两个actor
class ActorA extends Actor{
  override def receive: Receive ={
    case "start"=> println("i am a, I am ready")      //start :   自已发给自己
    case "are you ok" => {     //  这是接收另一个actor b发来的消息
      println("收到了 are you ok")
       //利用  sender 来获取发送者 B
      // sender()   ->  are you ok 消息的发送者
      sender() ! "i am ok too.."
    }
  }

}

//给对方发消息，要执有对象的引用
