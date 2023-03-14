package org.example;

// Demonstrating how Java stacks executions.
public class FlowWithTreatment {
    public static void main(String[] args) {
        System.out.println("Main init");
        method1();
        System.out.println("Main end");
    }

    private static void method1() {
        System.out.println("method1 init");
        try {
            method2();
        } catch (Exception err) {
            String msg = err.getMessage();
            System.out.println("Exeption: " + msg);
            err.printStackTrace();
        }
        System.out.println("method1 end");
    }

    private static void method2() {
        System.out.println("method2 init");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
        }
        System.out.println("method2 end");
    }
}