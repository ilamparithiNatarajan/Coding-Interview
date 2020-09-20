package com.java.features.eight;

public class LambdaExpressions {
    public static void main(String[] args) {
        // FuncInterf function = (String str) -> System.out.println(str);
        FuncInterf function = System.out::println;
        function.print("openJDK");
    }
}
