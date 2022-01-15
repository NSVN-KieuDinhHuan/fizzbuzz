package com.company;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String fizzBuzz(int number) {
        boolean isDivisionThree = (number % 3) == 0;
        boolean isDivisionFive = number % 5 == 0;
        if (isDivisionFive && isDivisionThree) {
            return FIZZ_BUZZ;
        } else if (isDivisionFive) {
            return BUZZ;
        } else if (isDivisionThree) {
            return FIZZ;
        }else {
            return number + "";
        }
    }
}
