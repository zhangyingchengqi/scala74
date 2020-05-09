package com.yc.akka.test2

import akka.actor.{Actor, ActorRef}

//ActorB是一个有参构造方法
class ActorB(val a:ActorRef) extends Actor{
  override def receive: Receive = {
    case "start" => {
      println("i am actorB, i am  ready")
      //   start
      a ! "are you ok"     //给   a发一条消息
    }
    case "i am ok too.."=>{
      println("good good")
      Thread.sleep(1000)
      a ! "are you ok"
    }
  }
}
