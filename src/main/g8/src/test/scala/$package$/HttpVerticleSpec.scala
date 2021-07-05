package $package$

import io.vertx.scala.ext.web.client._
import io.vertx.ext.web.client.WebClient
import io.vertx.lang.scala._
import io.vertx.lang.scala.testing.VerticleTesting
import org.scalatest.matchers.should.Matchers

class HttpVerticleSpec extends VerticleTesting[HttpVerticle] with Matchers {

  "HttpVerticle" should "bind to 8666 and answer with 'world'" in {
    val client = WebClient.create(vertx, WebClientOptions(defaultHost = "127.0.0.1", defaultPort = 8666))

    client.get("/hello")
      .send()
      .asScala()
      .map(_.body())
      .map(_.toString("UTF-8") should equal("world"))
  }

}
