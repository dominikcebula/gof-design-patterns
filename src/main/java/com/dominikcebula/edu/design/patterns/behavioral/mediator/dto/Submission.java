package com.dominikcebula.edu.design.patterns.behavioral.mediator.dto;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

public record Submission(String firstName, String lastName, String email) {
    public boolean isFullyFilled() {
        return Stream.of(firstName, lastName, email)
                .allMatch(StringUtils::isNotBlank);
    }
}
