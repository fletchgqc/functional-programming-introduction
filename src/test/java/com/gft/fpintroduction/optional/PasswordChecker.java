package com.gft.fpintroduction.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordChecker {

    String correctPassword = "password";

    @Test
    public void testCorrectPassword() {
        assertThat(isCorrectPassword(Optional.of("password "))).isTrue();
    }

    @Test
    public void testWrongPassword() {
        assertThat(isCorrectPassword(Optional.of("123"))).isFalse();
    }

    @Test
    public void testEmptyPassword() {
        assertThat(isCorrectPassword(Optional.empty())).isFalse();
    }

    private boolean isCorrectPassword(Optional<String> optionalPassword) {
        return optionalPassword.map(String::trim)
                .filter(correctPassword::equals)
                .isPresent();
    }
}
