import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "webdriver-factory"  % "0.41.0",
    "org.scalatest"       %% "scalatest"          % "3.2.14",
    "com.vladsch.flexmark" % "flexmark-all"       % "0.64.0",
    "io.cucumber"         %% "cucumber-scala"     % "8.11.0",
    "io.cucumber"          % "cucumber-junit"     % "7.8.1",
    "junit"                % "junit"              % "4.13.2",
    "com.novocode"         % "junit-interface"    % "0.11",
    "com.typesafe"         % "config"             % "1.4.2",
    "org.mongodb.scala"   %% "mongo-scala-driver" % "4.7.1"
  ).map(_ % Test)

}
