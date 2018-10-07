package com.chongyu.functionalprogramming;

import org.junit.Test;

import java.util.function.Function;

public class FunctionalProgramming {

    @Test
    public void myFPTest() {
        System.out.println(myFunction.apply(3));
        System.out.println(myMethod(10, int1 -> int1 * 3));
    }

    public int myMethod(int pararm1, Function<Integer, Integer> callback) {
        return pararm1 + callback.apply(3);
    }

    Function<Integer, Integer> myFunction = int1 -> int1 + 1;

}
