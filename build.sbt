import sbt._
import com.here.bom.Bom

// lazy val jacksonBom = Bom.read("com.fasterxml.jackson" % "jackson-bom" % "2.16.0")(bom => JacksonDependencies(bom))
lazy val jacksonBom2 = Bom.dependencies("com.fasterxml.jackson" % "jackson-bom" % "2.16.0")
// lazy val otelBom = Bom.read("io.opentelemetry.instrumentation" % "opentelemetry-instrumentation-bom-alpha" % "2.0.0-alpha")(bom => OtelDeps(bom))
// lazy val otelBom2 = Bom.dependencies("io.opentelemetry.instrumentation" % "opentelemetry-instrumentation-bom-alpha" % "2.0.0-alpha")

lazy val `sbt-bom-example-github` = project
  .in(file("."))
  // .settings(jacksonBom)
  .settings(jacksonBom2)
  // .settings(otelBom)
  // .settings(otelBom2)
  .settings(
    name := "sbt-bom-example-github",
    //resolvers := Resolver.DefaultMavenRepository +: resolvers.value,
    libraryDependencies += "com.typesafe.play" %% "play" % "2.8.21",
    libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.15.0",
    //libraryDependencies ++= jacksonBom.key.value.dependencies,
    dependencyOverrides ++= jacksonBom2.key.value,
    // dependencyOverrides ++= {
    //   println(otelBom2.key.value)
    //   otelBom2.key.value
    // },
  )