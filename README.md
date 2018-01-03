# Vaadin demo application using spring-boot and spring-plugin

This demo implements a "pluggable" [Vaadin](https://vaadin.com) application with [Spring Boot](https://projects.spring.io/spring-boot/) and [Spring Plugin](https://github.com/spring-projects/spring-plugin)

## Building the demo
```
git clone https://github.com/hectorlicea/vaadin-spring-plugin-parent.git
cd vaadin-spring-plugin-parent
mvn clean install
```

## Running the demo
```
java -jar main/target/main.jar
```
Start you browser with <http://localhost:8080>

All data show with default plugin.

![With default plugin](img/withdefaultplugin.png)

### Add weather-plugin plugin

**1. Stop the application**

**2. Create folder plugin. For example in `/opt`**
```
mkdir /opt/plugins
```

**3. Copy `weather-plugin.jar` file to folder plugins.**
```
cp weather-plugin/target/weather-plugin.jar /opt/plugins
```

**4. Edit `loader.properties` in `main` project**
```
nano app-main/src/main/resources/loader.properties
```
**5. In `loader.path` property, setting value with plugins folder and save the change**
```
loader.path = /opt/plugins
```
**6. Recompile `main` project**
```
cd main
mvn clean install
```
**7. Start `main` application**
```
java -jar target/main.jar
```
**8. Start you browser with <http://localhost:8080>**

weather data show with plugin 

![With wetaher plugin](img/withweatherplugin.png)