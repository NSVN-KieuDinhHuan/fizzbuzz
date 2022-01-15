package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("Testing fizz ")
    void TestFizz3(){
        int number=3;
        String expected="Fizz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void TestFizz6(){
        int number=6;
        String expected="Fizz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Testing buzz ")
    void TestBuzz5(){
        int number=5;
        String expected="Buzz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);

    }
    @Test
    void TestBuzz10(){
        int number=10;
        String expected="Buzz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);

    }

    @Test
    @DisplayName("Testing fizzBuzz ")
    void TestFizzBuzz(){
        int number=15;
        String expected="FizzBuzz";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("Testing number ")
    void TestNone(){
        int number=14;
        String expected="14";
        String result=FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);

    }
}
