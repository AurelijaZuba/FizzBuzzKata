package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String calculate(int number) {
        if(number % 5 == 0)
            return "Buzz";
        if(number % 3 == 0)
            return FIZZ;
        return String.valueOf(number);
    }
}
