package $package$

import io.vertx.scala.core._

import org.scalatest.matchers.should.Matchers

class HttpVerticleSpec extends VerticleTesting[HttpVerticle] with Matchers {

  "HttpVerticle" should "bind to 8666 and answer with 'world'" in {
    vertx.createHttpClient
      .getFuture(8666, "127.0.0.1", "/hello")
      .flatMap(_.bodyFuture)
      .map(_.toString("UTF-8") should equal("world"))
  }

}
