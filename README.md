# java-servlet-template

This is a simple Java servlet template used to quickly create a new servlet.  In addition to an example servlet, it also contains an example filter and context listener.

## Build

This project uses [Gradle](http://gradle.org/), and the following tasks assume that it is already installed.

### Generate Eclipse Artifacts

Download dependencies and create the Eclipse artifacts:
```
gradle eclipse
```

The project can now be imported in Eclipse to continue development.

### Build the WAR

Generate the WAR file:
```
gradle war
```

The WAR file can then be found under the `build/libs` folder.  Either deploy to a web container or use the Jetty Gradle tasks to run it locally.

### Deploy with Jetty

Deploy the exploded web application to a Jetty container:
```
gradle jettyRun
```

Or generate the WAR and deploy to a Jetty container:
```
gradle jettyRunWar
```

The servlet can now be accessed at the following address:
```
http://localhost:8080/java-servlet-template/template
```

## License

Copyright (c) 2017 Jeremy Parr-Pearson

The MIT License (MIT)
