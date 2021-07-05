package $package$

import io.vertx.lang.scala.ScalaVerticle

import scala.concurrent.Promise
import scala.util.Success

class BusVerticle extends ScalaVerticle {

  override def start(promise: Promise[Unit]): Unit = {
    vertx
      .eventBus()
      .consumer[String]("testAddress")
      .handler(_.reply("Hello World!"))
      .completionHandler(_ => promise.complete(Success((): Unit)))
  }

}

