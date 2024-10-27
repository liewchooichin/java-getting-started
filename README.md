# Notes

## Useful resource for functional interfaces

Discovering `java.util.function` 
https://dev.java/learn/lambdas/functional-interfaces/

Code with Java 21


## Terminologies

A **package** is simply a container for Java classes related to each other.


## Creating a maven project

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
```

## Properties to use Java version

```
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <java.version>21</java.version>
    <maven.compiler.release>21</maven.compiler.release>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
  </properties>

```

## Create an executable JAR file

In the **pom.xml**, add the following section:

Add from <configuration>...</configuration>

```
<build>
  ...
  <plugin>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.4.2</version>
    <configuration>
      <archive>
        <manifest>
          <addClasspath>true</addClasspath>
          <mainClass>com.a02.app.App</mainClass>
        </manifest>
      </archive>
    </configuration>
  </plugin>
  ...
</build>
```

