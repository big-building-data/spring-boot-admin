# BBData: Spring Boot Admin

Very basic [Spring Boot Admin Server](https://codecentric.github.io/spring-boot-admin/2.3.0/) generated with the 
[Spring Initializr](https://start.spring.io/).

This is meant to be used as a monitor to bbdata-api applications. 
See the [BBData API README](https://github.com/big-building-data/bbdata-api) for more details.

## Changes (compared to the basic)

* set the default port to `8222` instead of `8080`;
* add `bootJar` target in gradle;

## Setup and run

Create a bootable jar:
```bash
./gradlew bootJar
```

Launch:
```bash
./build/libs/spring-boot-admin-*.jar
```

## Clients

For clients to connect, add the `spring-boot-admin-starter-client` dependency in your `build.gradle.kts`:
```kotlin
implementation("de.codecentric:spring-boot-admin-starter-client")
```

Add the following to your `application.properties`:
```properties
## Spring Boot Admin

# expose every actuator available, but ensure it runs on another (secured) port !
management.server.port=8111
management.endpoints.web.exposure.include=*

# enable spring boot admin client
spring.boot.admin.client.enabled=true
# provide this server URL TODO
spring.boot.admin.client.url=http://localhost:8222
# give a name to your app (will show in the UI)
spring.boot.admin.client.instance.name=Spring Boot App Instance
```

Done.