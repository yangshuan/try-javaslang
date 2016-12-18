package com.oomlife.javaslang.function;

import javaslang.Function2;

/**
 * Created by shuayang on 16/12/14.
 * Function in Javaslang
 */
public class TryFunction {
    public static void main(String[] args) {
        Function2<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("With functional style function 1 + 2 = " + add.apply(1, 2));

        Function2<Integer, Integer, Integer> addWithInnerClass = new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        System.out.println("With inner class style function 1 + 2 = " + addWithInnerClass.apply(1, 2));

        Function2<Integer, Integer, Integer> addWithFunction = Function2.of(Math::addExact);
        System.out.println("Function created by another function 1 + 2 = " + addWithFunction.apply(1, 2));
    }
}
