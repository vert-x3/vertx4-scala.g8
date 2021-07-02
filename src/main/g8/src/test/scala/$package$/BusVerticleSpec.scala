package $package$

import org.scalatest.matchers.should.Matchers

class HttpVerticleSpec extends VerticleTesting[HttpVerticle] with Matchers {

  "HttpVerticle" should "bind to 8666 and answer with 'world'" in {
    val client = WebClient.create(vertx)
    client.get(8666, "127.0.0.1", "/hello")
      .send()
      .asScala()
      .map(_.body())
      .map(_.toString("UTF-8") should equal("world"))
  }

}


