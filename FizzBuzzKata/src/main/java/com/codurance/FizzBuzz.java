package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String calculate(int number) {
        if(number == 3)
            return FIZZ;
        return String.valueOf(number);
    }
}
