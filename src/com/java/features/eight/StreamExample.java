package com.java.features.eight;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        // parallel()
        List<String> names = Arrays.asList("java", "ruby", "objectiveC", "c++", "javascript","swift");
        System.out.println("parallel:");
        names.stream().parallel().forEach(System.out::println);
        System.out.println("normal:");
        names.forEach(System.out::println);

        // reduce(identity, accumulator)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int result = numbers.stream().reduce(1, (Integer x , Integer y) -> x*y);
        System.out.println("result of multiplication :" + result);


    }
}
