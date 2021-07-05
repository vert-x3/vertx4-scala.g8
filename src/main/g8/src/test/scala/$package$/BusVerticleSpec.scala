package $package$

import io.vertx.lang.scala._
import io.vertx.lang.scala.testing.VerticleTesting
import org.scalatest.matchers.should.Matchers

class BusVerticleSpec extends VerticleTesting[BusVerticle] with Matchers {

  "BusVerticle" should "reply to a message" in {
    val future = vertx.eventBus().request[String]("testAddress", "msg").asScala()

    future.map(res => res.body() should equal("Hello World!"))
  }

}


