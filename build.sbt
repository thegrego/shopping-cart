lazy val commonSettings = Seq(
  name := "shopping-cart",
  version := "1.0",
  scalaVersion := "2.11.8"
)

lazy val libs = Seq(
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.5"
)

lazy val shopping_cart = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= libs
  )