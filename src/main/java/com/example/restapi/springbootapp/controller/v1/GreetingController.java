package com.example.restapi.springbootapp.controller.v1;

import com.example.restapi.springbootapp.dto.Greeting;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.util.concurrent.atomic.AtomicLong;

@OpenAPIDefinition(servers = { @Server(url = "http://localhost:7001") }, info = @Info(title = "Sample Spring Boot API", version = "v1", description = "A demo project using Spring Boot with Swagger-UI enabled", license = @License(name = "MIT License", url = "https://github.com/bchen04/springboot-swagger-rest-api/blob/master/LICENSE"), contact = @Contact(url = "https://www.linkedin.com/in/bchen04/", name = "Ben Chen")))
@RestController
@RequestMapping("v1/greeting")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Operation(summary = "Returns a greeting message")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(type = "object"))) })
    @GetMapping(value = "/message", produces = { "application/json" })
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
