name := "amqp-client"

organization := "com.github.sstone"
 
version := "1.2-SNAPSHOT"
 
scalaVersion := "2.10.1"

scalacOptions  ++= Seq("-feature", "-language:postfixOps")
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies <<= scalaVersion { scala_version => 
    val akkaVersion   = "2.1.4"
    Seq(
        "com.typesafe.akka"    %% "akka-actor"          % akkaVersion,
        "com.rabbitmq"         % "amqp-client"          % "3.1.1",
        "com.typesafe.akka"    %% "akka-testkit"        % akkaVersion  % "test",
        "org.scalatest"        %% "scalatest"           % "1.9.1" % "test",
        "junit"           	   % "junit"                % "4.11" % "test"
    )
}
