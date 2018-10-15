# Cucumber for testing a web-based application (example/demo)

## Pre-requirements

* Java 11
* Maven 3.5.4 -- or you can use Gradle

## Building and testing

### Maven

```
mvn install
```

### Gradle

```
./gradlew build   --- or Windos: gradle.bat build
```

## Check for updated dependencies

### Maven
```
mvn versions:display-dependency-updates 
```
Uses [versions-rules.xml](versions-rules.xml) to avoid try to avoid pre-release versions.


### Gradle

Oups ... not implemented yet ... perhaps [contribute?](CONTRIBUTING.md)

This might be helpful: https://github.com/ben-manes/gradle-versions-plugin

## Contributing

See [CONTRIBUTING](CONTRIBUTING.md).

## License

See [LICENSE](LICENSE).
