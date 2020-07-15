package com.osman.springbootstarter.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID id;
// java - Spring boot validation annotations @Valid and @NotBlank not working - Stack Overflow
// https://stackoverflow.com/questions/48614773/spring-boot-validation-annotations-valid-and-notblank-not-working
    @NotBlank
    private final String name;

    public Person(
            @JsonProperty("id") UUID id,
            @JsonProperty("name") String name
    ) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
