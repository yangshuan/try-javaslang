package com.oomlife.javaslang.tuple;

import javaslang.Tuple;
import javaslang.Tuple2;

/**
 * Created by shuayang on 16/12/14.
 * Tuple in Javaslang
 */
public class TryTuple {
    public static void main(String[] args) {
        Tuple2<String, Integer> java8 = Tuple.of("Java", 8);// 创建tuple

        System.out.println("First element in tuple is " + java8._1);
        System.out.println("Second element in tuple is " + java8._2);

        System.out.println("Length of tuple is " + java8.arity());

        Tuple2<String, Integer> newTuple = java8.map(
                _1 -> _1 + "slang",
                _2 -> _2 / 4
        );
        System.out.println("New Tuple after mapping is " + newTuple);

        Tuple2<String, Integer> newTuple2 = java8.map(
                (_1, _2) -> Tuple.of(_1 + "slang2", _2 / 4)
        );
        System.out.println("New Tuple after another mapping is " + newTuple2);

        String anotherValue = java8.transform((_1, _2) -> _1 + "slang " + _2 / 4);
        System.out.println("New Tuple after transforming is " + anotherValue);

        System.out.println("Seq of tuple is " + java8.toSeq());
    }
}
