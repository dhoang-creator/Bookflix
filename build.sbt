ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .settings(
    name := "Bookflix"
  )

lazy val tapirVersion = "1.9.6"

libraryDependencies ++= Seq(

  // Tapir version
  "com.softwaremill.sttp.tapir"       %% "tapir-http4s-server"              % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-prometheus-metrics"         % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-swagger-ui-bundle"          % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-json-circe"                 % tapirVersion,

  // Http4s
  "org.http4s"                        %% "http4s-ember-server"              % "0.23.24",

  // Logging
  "ch.qos.logback"                    % "logback-classic"                   % "1.4.14",

  // Testing
  "com.softwaremill.sttp.tapir"       %% "tapir-sttp-stub-server"           % tapirVersion        % Test,
  "org.scalatest"                     %% "scalatest"                        % "3.2.17"            % Test,
  "com.softwaremill.sttp.client3"     %% "circe"                            % "3.9.1"             % Test
    )
