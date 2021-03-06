import sbt.Package.ManifestAttributes

scalaVersion := "2.13.6"

name := "hello-world"
version := "1.0"

val VertxVersion = "4.2.0-SNAPSHOT"

resolvers += "Vert.x SNAPSHOTS" at "https://s01.oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "io.vertx" %% "vertx-lang-scala"      % VertxVersion
libraryDependencies += "io.vertx" %% "vertx-lang-scala-test" % VertxVersion
libraryDependencies += "io.vertx" %  "vertx-web"             % VertxVersion
libraryDependencies += "io.vertx" %  "vertx-web-client"      % VertxVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2"

packageOptions += ManifestAttributes(
  ("Main-Verticle", "scala:$package$.HttpVerticle"))

