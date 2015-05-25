# java-servlet-template

This is a simple Java Servlet template used to quickly create a new servlet.

## Configuration

The following resources should be changed when using this template to create a new servlet:

**Servlet**
* `src/main/java/org/example/ServletTemplate.java`
  * Change the class name (filename and in class)
  * Implement servlet methods as required
* `src/main/test/org/example/ServletTemplateTest.java`
  * Change the class name (filename and in class)
  * Implement tests as required
* `src/main/webapp/WEB-INF/web.xml`
  * Change the servlet name and class
  * Change the servlet URL pattern

Note that changes in the `web.xml` file will override the annotation values in the servlet class.

**Gradle**
* `build.gradle`
  * Change the application `version`
  * Change the manifest properties (`Implementation-Title`, etc)
  * Add any applicable library dependencies
* `settings.gradle`
  * Change the project name

**Eclipse**
* `.project`
  * Change the project name
* `.classpath`
  * Add any applicable libraries

## Build

This project uses [Gradle](http://gradle.org/), and the following tasks assume that it is already installed.

### Resolve Dependencies

Resolve dependencies and place them in the `lib` folder (ensure that all needed dependencies are also listed in the `.classpath` file, and run this task before opening the project in Eclipse):
```
gradle prepare
```

### Build the WAR

Generate the WAR file (can then be found under the `build/libs` folder):
```
gradle war
```

Note that the WAR `manifest` properties can be set under the `build.gradle` file.

### Deploy with Jetty

Deploy the generated WAR file to a Jetty container:
```
gradle jettyRun
```

Or generate the WAR and deploy to a Jetty container:
```
gradle jettyWarRun
```

Note that the `httpPort` can be set under the `build.gradle` file.

## License

Copyright (c) 2015 Jeremy Parr-Pearson

The MIT License (MIT)
