package com.oomlife.javaslang.function;

import javaslang.Function0;

import java.util.Objects;

/**
 * Created by shuayang on 16/12/14.
 * Memoization of function in Javaslang
 */
public class TryFunctionMemoization {
    public static void main(String[] args) {
        Function0<Double> random = Function0.of(Math::random).memoized();

        System.out.println(random.isMemoized());

        System.out.println(Objects.equals(random.apply(), random.apply()));
    }
}
