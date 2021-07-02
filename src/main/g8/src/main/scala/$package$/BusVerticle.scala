package $package$

import io.vertx.lang.scala.ScalaVerticle

import scala.concurrent.{Future, Promise}
import scala.util.Success

class BusVerticle extends ScalaVerticle {

  override def startFuture(): Future[_] = {
    val promise = Promise[Unit]()
    vertx
      .eventBus()
      .consumer[String]("testAddress")
      .handler(_.reply("Hello World!"))
      .completionHandler(_ => promise.complete(Success((): Unit)))
    promise.future
  }
}

