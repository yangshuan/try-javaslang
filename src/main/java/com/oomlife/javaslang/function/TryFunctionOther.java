package com.oomlife.javaslang.function;

import javaslang.Function2;
import javaslang.Tuple;

/**
 * Created by shuayang on 16/12/14.
 * Other features of function in Javaslang
 */
public class TryFunctionOther {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;

        System.out.println("Argument number of add function is " + divide.arity());

        System.out.println("Tuple version function: 4 / 2 = " + divide.tupled().apply(Tuple.of(4, 2)));

        System.out.println("Reversed version function: 4 / 2 = " + divide.reversed().apply(2, 4));

        System.out.println("Whether the original divide function is memoized: " + divide.isMemoized());
        System.out.println("Whether the memoized version function is memoized: " + divide.memoized().isMemoized());
    }
}
