package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {


    @Test
    void return_one_when_passing_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.calculate(1)).isEqualTo("1");
    }

    @Test
    void return_two_when_passing_two() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.calculate(2)).isEqualTo("2");
    }

    @Test
    void return_four_when_passing_four() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.calculate(4)).isEqualTo("4");
    }
}
