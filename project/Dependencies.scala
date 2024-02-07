import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"         % "0.15.0",
    "org.scalatest"       %% "scalatest"              % "3.2.15",
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.0",
    "io.cucumber"         %% "cucumber-scala"         % "8.17.0",
    "io.cucumber"          % "cucumber-junit"         % "7.14.0",
    "junit"                % "junit"                  % "4.13.2",
    "com.novocode"         % "junit-interface"        % "0.11",
    "com.typesafe"         % "config"                 % "1.4.2",
    "org.mongodb.scala"   %% "mongo-scala-driver"     % "4.9.0",
    "com.typesafe.play"   %% "play-ahc-ws-standalone" % "2.1.10",
    "com.typesafe.play"   %% "play-json"              % "2.9.4"
  ).map(_ % Test)

}
