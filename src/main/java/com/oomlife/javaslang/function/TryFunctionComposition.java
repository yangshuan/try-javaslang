package com.oomlife.javaslang.function;

import javaslang.Function1;

/**
 * Created by shuayang on 16/12/14.
 * Composition of function in Javaslang
 */
public class TryFunctionComposition {
    public static void main(String[] args) {
        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;

        Function1<Integer, Integer> compositionFunction = plusOne.andThen(multiplyByTwo);
        System.out.println("(2 + 1) * 2 = " + compositionFunction.apply(2));

        Function1<Integer, Integer> compositionFunction2 = plusOne.compose(multiplyByTwo);
        System.out.println("2 * 2 + 1 = " + compositionFunction2.apply(2));
    }
}
