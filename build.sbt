ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .settings(
    name := "Bookflix"
  )

lazy val tapirVersion = "1.9.6"

libraryDependencies ++= Seq(

  // Cats
  "org.typelevel"                     %% "cats-core"                        % "2.10.0",
  "org.typelevel"                     %% "cats-effect"                      % "3.6-0142603",

  // Circe
  "io.circe"                          %% "circe-core"                       % "0.15.0-M1",

// Tapir version
  "com.softwaremill.sttp.tapir"       %% "tapir-http4s-server"              % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-prometheus-metrics"         % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-swagger-ui-bundle"          % tapirVersion,
  "com.softwaremill.sttp.tapir"       %% "tapir-json-circe"                 % tapirVersion,

  // Http4s
  "org.http4s"                        %% "http4s-ember-server"              % "0.23.24",
  "org.http4s"                        %% "http4s-circe"                     % "1.0-234-d1a2b53",

  // Logging
  "ch.qos.logback"                    % "logback-classic"                   % "1.4.14",

  // Testing
  "com.softwaremill.sttp.tapir"       %% "tapir-sttp-stub-server"           % tapirVersion        % Test,
  "org.scalatest"                     %% "scalatest"                        % "3.2.17"            % Test,
  "com.softwaremill.sttp.client3"     %% "circe"                            % "3.9.1"             % Test
    )
