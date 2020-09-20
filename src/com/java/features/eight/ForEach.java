package com.java.features.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
        public static void main(String[] args) {
            List<String> subList = new ArrayList<>();
            subList.add("Maths&English&English");
            subList.add("Tamil&Politics");
            subList.add("French&Arts&Arts");
            subList.forEach((String subjects) -> {
                String[] subs = subjects.split("&");
                Arrays.stream(subs)
                        .map((String sub) -> "\"" + sub + "\"")
                        .distinct()
                        .forEach(System.out::println);
            });
        }

}
