## spring-standalone-without-xml

* Configure Spring DI Context Example without any XML
* Available with Spring 3.0

## Commands

    $ mvn archetype:generate -DgroupId=com.lethee.templates.sswx -DartifactId=spring-standalone-without-xml \
    -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

    $ mvn compile exec:java -Dexec.mainClass=com.lethee.templates.sswx.App
