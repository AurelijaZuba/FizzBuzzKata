package com.codurance;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String calculate(int number) {
        if(isMultipleOf5(number) && isMultipleOf3(number))
            return FIZZ + BUZZ;
        if(isMultipleOf5(number))
            return BUZZ;
        if(isMultipleOf3(number))
            return FIZZ;
        return String.valueOf(number);
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}
