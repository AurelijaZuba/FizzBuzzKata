package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String calculate(int number) {
        if(isMultipleOf5(number) && number % 3 == 0)
            return "FizzBuzz";
        if(isMultipleOf5(number))
            return BUZZ;
        if(number % 3 == 0)
            return FIZZ;
        return String.valueOf(number);
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
