package com.java.features.eight;

public class Example implements InterfaceWithDefaultMethod {
    public static void main(String[] args) {
            Example example = new Example();
            example.print(new Object());
            example.print("j a v a");
            example.print(8);
    }

    @Override
    public void print(int i) {
        System.out.println(i);
    }
}
