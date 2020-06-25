import sbt.Package._
import sbt._
import Docker.autoImport.exposedPorts

scalaVersion := "2.13.2"

enablePlugins(DockerPlugin)
exposedPorts := Seq(8666)

libraryDependencies ++= Vector (
  Library.vertx_lang_scala,
  Library.vertx_web,
  Library.vertx_web_client  % "test",
  Library.scalaTest         % "test",
  // Uncomment for clustering
  // Library.vertx_hazelcast,

)

packageOptions += ManifestAttributes(
  ("Main-Verticle", "scala:$package$.HttpVerticle"))

