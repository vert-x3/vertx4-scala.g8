package $package$

import org.scalatest._

import io.vertx.scala.core._

class BusVerticleSpec extends VerticleTesting[BusVerticle] with Matchers {

  "BusVerticle" should "reply to a message" in {
    val future = vertx.eventBus().requestFuture[String]("testAddress", "msg")

    future.map(res => res.body() should equal("Hello World!"))
  }

}


