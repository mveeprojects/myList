# myList

Simple Scala API enabling users to manage a list of assets.

### Technologies used (or to be used)
* Scala 2.12.10
* Couchbase 6.0.2
* Kafka
* Akka HTTP
* ScalaTest

### Resources
* https://doc.akka.io/docs/akka-http/current/introduction.html
* https://github.com/cb372/sbt-explicit-dependencies
* http://www.scalatest.org/getting_started_with_feature_spec
* http://rest-assured.io/
* https://github.com/marcuslonnberg/sbt-docker

### Useful SBT Commands

`sbtw`

I have included an sbt wrapper from [this repo on GitHub](https://github.com/paulp/sbt-extras). If on Linux/Mac you might need to run `chmod +x ./sbtw` to ensure this is executable before running it.

`./sbtw docker`

The [sbt-docker plugin](https://github.com/marcuslonnberg/sbt-docker) is being used to generate docker images of this application, running this will generate a local docker image, the config for this can be found in `build.sbt`.

`./sbtw unusedCompileDependencies`

The [sbt-explicit-dependencies plugin](https://github.com/cb372/sbt-explicit-dependencies) has been added to this project to enable this command to highlight unused sbt dependencies.