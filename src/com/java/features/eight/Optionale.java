package com.java.features.eight;

import java.util.Optional;
import java.util.function.Predicate;

public class Optionale {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "zero";
        Optional<String> stringOptional = Optional.of(str[0]);

        // ifPresent
        stringOptional.ifPresent(s -> print("first char", s.charAt(0)));


        // get
        String newString = stringOptional.get();
        print("new string", newString);
        Predicate<String> predicate = (String s) -> s.endsWith("o");

        print("result of filter", stringOptional.filter(predicate).isPresent());

        // orElseGet
        Optional<Integer> i = Optional.empty();
        print("result of orElse", i.orElse(5));

        // map
        print("result of map", stringOptional.map(String::intern).get());

        // flatMap
        print("result of flatMap", stringOptional.flatMap((String s) -> Optional.of(s.intern())).get());

        // ofNullable
        print("result of ofNullable", Optional.ofNullable(null));

        Optional<Object> s1 = Optional.of(Optional.empty());
        print("inner optional", s1.get());

    }

    public static void print(String description, Object value) {
        System.out.println(description + " : " + value);
    }
}
