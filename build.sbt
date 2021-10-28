import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.0.1"
ThisBuild / organization     := "dev.Bartumeu"
ThisBuild / organizationName := "Bartumeu"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "shopping-cart"
  )
  .aggregate(core, tests)

lazy val tests = (project in file("modules/tests"))
  .settings(
    name := "shopping-cart-test-suite",
    libraryDependencies ++= Seq(
      Libraries.scalaTest
    )
  )
  .dependsOn(core)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "shopping-cart-core",
    libraryDependencies ++= Seq(
      Libraries.scalaTest
    )
  )
