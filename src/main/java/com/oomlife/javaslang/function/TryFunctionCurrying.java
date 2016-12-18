package com.oomlife.javaslang.function;

import javaslang.Function1;
import javaslang.Function2;

/**
 * Created by shuayang on 16/12/14.
 * Currying of function in Javaslang
 */
public class TryFunctionCurrying {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> add = (a, b) -> a + b;
        Function1<Integer, Integer> addOne = add.curried().apply(1);

        System.out.println("2 + 1 = " + addOne.apply(2));
    }
}
