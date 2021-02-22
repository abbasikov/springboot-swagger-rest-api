# Sample Spring Boot (2.3.2) RESTful API with Swagger (OpenAPI 3)

While searching through GitHub for some boilerplate code on how to setup a Spring Boot project with Swagger, I found it quite difficult to find a working example with a more recent version of Spring Boot and Java (i.e. 14). Anyways, I thought I’d create my own and share with everyone. This is for anyone that needs some quick boilerplate code to setup their new API project.

## What You Need

* Java 14
* Maven 3.6.0+

## Build and Run the Sample

You can import the code straight into your preferred IDE or run the sample using the following command (in the root project folder).

```zsh
$  mvn spring-boot:run
```
After the application runs, navigate to `http://localhost:7001/swagger-ui/index.html?configUrl=/api-docs/swagger-config` in your web browser to access the Swagger UI portal.
