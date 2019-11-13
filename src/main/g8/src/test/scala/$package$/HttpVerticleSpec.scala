package $package$

import org.scalatest.Matchers

import org.scalatest.Matchers

import scala.concurrent.Promise
import io.vertx.scala.core._

class HttpVerticleSpec extends VerticleTesting[HttpVerticle] with Matchers {

  "HttpVerticle" should "bind to 8666 and answer with 'world'" in {
    val promise = Promise[String]

    vertx.createHttpClient()
      .getNowFuture(8666, "127.0.0.1", "/hello")
      .map(
        r => {
          r.exceptionHandler(promise.failure)
          r.bodyHandler(b => promise.success(b.toString))
        }
      )

    promise.future.map(res => res should equal("world"))
  }

}
