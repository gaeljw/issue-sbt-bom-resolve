// import sbt._
// import com.here.bom.Bom

// case class JacksonDependencies(platformBom: Bom) {
//   val dependencies: Seq[ModuleID] = Seq(
//     "com.fasterxml.jackson.core" % "jackson-databind" % platformBom
//   )

//   val allDeps: Seq[ModuleID] = platformBom.bomDependencies
// }

// case class OtelDeps(platformBom: Bom) {
//   // val dependencies: Seq[ModuleID] = Seq(
//   //   "io.opentelemetry" % "opentelemetry-context" % platformBom
//   // )

//   val allDeps: Seq[ModuleID] = platformBom.bomDependencies
// }