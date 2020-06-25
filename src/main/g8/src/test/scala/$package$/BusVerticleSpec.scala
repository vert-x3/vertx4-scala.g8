package $package$

import io.vertx.scala.core._
import org.scalatest.matchers.should.Matchers

class BusVerticleSpec extends VerticleTesting[BusVerticle] with Matchers {

  "BusVerticle" should "reply to a message" in {
    val future = vertx.eventBus().requestFuture[String]("testAddress", Some("msg"))

    future.map(res => res.body() should equal("Hello World!"))
  }

}


