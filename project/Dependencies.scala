import sbt._

object Dependencies {

  object Version {
    val scalaTest = "3.2.9"
  }

  object Libraries {
    // Test
    val scalaTest = "org.scalatest"   %%  "scalatest"   %   Version.scalaTest   %   Test
  }
}
