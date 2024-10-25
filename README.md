# Notes

## Useful resource for functional interfaces

Discovering `java.util.function` 
https://dev.java/learn/lambdas/functional-interfaces/


## Creating a maven project

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false
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

