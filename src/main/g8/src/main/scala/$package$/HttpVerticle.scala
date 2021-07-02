package $package$

import io.vertx.lang.scala.ScalaVerticle
import io.vertx.lang.scala._
import io.vertx.ext.web._

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
      .listen(8666, "0.0.0.0")
      .asScala()
  }
}

