
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Bookflix"
  )

scalacOptions += "-Ypartial-unification"

lazy val tapirVersion = "1.7.0"
lazy val circeVersion = "0.14.0-M5"

libraryDependencies ++= Seq(

  // Cats
  "org.typelevel"                     %% "cats-core"                        % "2.10.0",
  "org.typelevel"                     %% "cats-effect"                      % "3.5.1",

  // Circe
  "io.circe"                          %% "circe-core"                       % "0.14.5",

// Tapir version
  "com.softwaremill.sttp.tapir"       %% "tapir-http4s-server"              % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-prometheus-metrics"         % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-swagger-ui-bundle"          % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-json-circe"                 % tapirVersion,

  // Http4s

  // Http4s
//  "org.http4s"                        %% "http4s-ember-server"              % "0.23.24",
//  "org.http4s"                        %% "http4s-circe"                     % "1.0-234-d1a2b53",

  // Logging
  "ch.qos.logback"                    % "logback-classic"                   % "1.4.7",

  // Testing
  "com.softwaremill.sttp.tapir"       %% "tapir-sttp-stub-server"           % tapirVersion        % Test,
  "org.scalatest"                     %% "scalatest"                        % "3.2.17"            % Test,
  "com.softwaremill.sttp.client3"     %% "circe"                            % "3.9.1"             % Test
    )
