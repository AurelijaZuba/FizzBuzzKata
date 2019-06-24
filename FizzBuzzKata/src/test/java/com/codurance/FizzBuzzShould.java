package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {


    @Test
    void return_one_when_passing_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.calculate(1)).isEqualTo("1");
    }
}
