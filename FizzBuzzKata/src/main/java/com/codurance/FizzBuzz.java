package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String calculate(int number) {
        if(number % 5 == 0 && number % 3 == 0)
            return "FizzBuzz";
        if(number % 5 == 0)
            return BUZZ;
        if(number % 3 == 0)
            return FIZZ;
        return String.valueOf(number);
    }
}
