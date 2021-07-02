import sbt.Package.ManifestAttributes

scalaVersion := "2.13.6"

name := "hello-world"
version := "1.0"

val VertxVersion = "4.0.3-SNAPSHOT"
resolvers += Resolver.mavenLocal
libraryDependencies += "io.vertx" %% "vertx-lang-scala" % VertxVersion
libraryDependencies += "io.vertx" %  "vertx-web"        % VertxVersion
libraryDependencies += "io.vertx" %  "vertx-web-client" % VertxVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2"

packageOptions += ManifestAttributes(
  ("Main-Verticle", "scala:$package$.HttpVerticle"))

