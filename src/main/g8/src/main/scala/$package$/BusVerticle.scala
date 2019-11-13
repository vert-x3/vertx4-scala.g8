package $package$

import io.vertx.lang.scala.ScalaVerticle

import io.vertx.scala.core._

import scala.concurrent.Future

class BusVerticle extends ScalaVerticle {

  override def startFuture(): Future[_] = {
    vertx
      .eventBus()
      .consumer[String]("testAddress")
      .handler(_.reply("Hello World!"))
      .completionFuture()
  }
}

