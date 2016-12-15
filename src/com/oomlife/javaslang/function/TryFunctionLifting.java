package com.oomlife.javaslang.function;

import javaslang.Function2;
import javaslang.control.Option;

/**
 * Created by shuayang on 16/12/14.
 * Lifting of function in Javaslang
 */
public class TryFunctionLifting {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;
        Function2<Integer, Integer, Option<Integer>> safeDivide = Function2.lift(divide);

        System.out.println("4 / 2 = " + safeDivide.apply(4, 2));
        System.out.println("4 / 2 = " + safeDivide.apply(4, 2).get());
        System.out.println("1 / 0 = " + safeDivide.apply(1, 0));
    }
}
