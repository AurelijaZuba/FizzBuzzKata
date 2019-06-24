package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {


    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4"
    })
    public void return_string_value_of_number_for_non_multiples_of_three_or_five(int input, String expected) {
       assertThat(fizzBuzz.calculate(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz"
    })
    public void return_Fizz_when_multiple_of_three(int input, String expected) {
        assertThat(fizzBuzz.calculate(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz"
    })
    void return_Buzz_when_multiple_of_five(int input, String expected) {
        assertThat(fizzBuzz.calculate(input)).isEqualTo(expected);
    }

    @Test
    void return_FizzBuzz_when_multiples_of_three_and_five() {
        assertThat(fizzBuzz.calculate(15)).isEqualTo("FizzBuzz");
    }
}
