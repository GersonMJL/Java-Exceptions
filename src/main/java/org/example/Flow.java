package org.example;

// Demonstrating how Java stacks executions.
public class Flow {
    public static void main(String[] args) {
        System.out.println("Main init");
        method1();
        System.out.println("Main end");
    }

    private static void method1() {
        System.out.println("method1 init");
        method2();
        System.out.println("method1 end");
    }

    private static void method2() {
        System.out.println("method2 init");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("method2 end");
    }
}