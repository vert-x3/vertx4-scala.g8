package $package$

import io.vertx.lang.scala._
import io.vertx.ext.web.Router

import scala.concurrent.Promise
import scala.util.{Failure, Success}

class HttpVerticle extends ScalaVerticle {

  override def start(promise: Promise[Unit]): Unit = {
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
      .onComplete{
        case Success(_) => promise.complete(Success(()))
        case Failure(e) => promise.complete(Failure(e))
      }
  }

}

