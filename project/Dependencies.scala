import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc"         %% "ui-test-runner"         % "0.31.0",
    "org.scalatest"       %% "scalatest"              % "3.2.19",
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.8",
    "io.cucumber"         %% "cucumber-scala"         % "8.21.0",
    "io.cucumber"          % "cucumber-junit"         % "7.18.0",
    "junit"                % "junit"                  % "4.13.2",
    "com.novocode"         % "junit-interface"        % "0.11",
    "com.typesafe"         % "config"                 % "1.4.3",
    "org.mongodb.scala"   %% "mongo-scala-driver"     % "5.1.1",
    "com.typesafe.play"   %% "play-ahc-ws-standalone" % "2.2.9",
    "com.typesafe.play"   %% "play-json"              % "2.10.5"
  ).map(_ % Test)

}
