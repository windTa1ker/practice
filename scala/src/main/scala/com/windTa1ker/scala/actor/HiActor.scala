package com.windTa1ker.scala.actor

import scala.actors.Actor

object MyMain{
      def main(args: Array[String]): Unit = {
            val actor = new HiActor()
            actor.start()
            actor ! "Hi"
      }
}

class HiActor extends Actor{
      override def act(): Unit = {
            while(true){
                  receive{
                        case "Hi" => println("hello")
                  }
            }
      }
}


