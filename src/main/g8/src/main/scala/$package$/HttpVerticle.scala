package $package$

import io.vertx.lang.scala.ScalaVerticle
import io.vertx.scala.ext.web._
import io.vertx.scala.core._

import scala.concurrent.Future

class HttpVerticle extends ScalaVerticle {


  override def startFuture(): Future[_] = {
    //Create a router to answer GET-requests to "/hello" with "world"
    val router = Router.router(vertx)
    router
      .get("/hello")
      .handler(_.response().end("world"))

    vertx
      .createHttpServer()
      .requestHandler(router)
      .listenFuture(8666, "0.0.0.0")
  }
}
