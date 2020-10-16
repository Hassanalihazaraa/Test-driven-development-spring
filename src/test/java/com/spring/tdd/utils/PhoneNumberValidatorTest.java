package com.spring.tdd.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneNumberValidatorTest {

    private PhoneNumberValidator undertest;

    @BeforeEach
    void setUp() {
        undertest = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "+32470000000, true",
            "+324700000000, false",
            "32470000000, false"

    })
    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {
        boolean isValid = undertest.test(phoneNumber);
        assertThat(isValid).isEqualTo(expected);
    }
}
