package com.java.features.eight;

public interface InterfaceWithDefaultMethod {
    default void print(Object anything) {
        System.out.println("object : "+ anything);
    }

    default void print(String s) {
        System.out.println("string :"+ s);
    }

    void print(int i);
}
