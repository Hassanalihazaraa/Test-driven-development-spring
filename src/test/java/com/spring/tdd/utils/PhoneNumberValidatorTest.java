package com.spring.tdd.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneNumberValidatorTest {

    private PhoneNumberValidator undertest;

    @BeforeEach
    void setUp() {
        undertest = new PhoneNumberValidator();
    }

    @Test
    @DisplayName("Should fail when phoneNumber is incorrect")
    void itShouldValidatePhoneNumber() {

        String phoneNumber = "+32470000000";
        boolean isValid = undertest.test(phoneNumber);
        assertThat(isValid).isTrue();
    }

    @Test
    @DisplayName("Should fail when length is bigger than 12")
    void itShouldValidatePhoneNumberWhenInCorrectAndHasLengthBiggerThan12() {

        String phoneNumber = "+324700000000";
        boolean isValid = undertest.test(phoneNumber);
        assertThat(isValid).isFalse();
    }

    @Test
    @DisplayName("Should fail when does not start with +")
    void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign() {

        String phoneNumber = "32470000000";
        boolean isValid = undertest.test(phoneNumber);
        assertThat(isValid).isFalse();
    }
}
