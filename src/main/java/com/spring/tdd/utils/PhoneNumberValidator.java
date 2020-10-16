package com.spring.tdd.utils;

import java.util.function.Predicate;

public class PhoneNumberValidator implements Predicate<String> {
    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("+32")
                && phoneNumber.length() == 12;
    }
}
