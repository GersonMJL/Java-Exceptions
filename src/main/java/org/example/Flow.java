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
        try {
            method2();
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Exeption: " + msg);
            ex.printStackTrace();
        }
        method3();
        System.out.println("method1 end");
    }

    private static void method2() throws MyException {
        System.out.println("method2 init");
        throw new MyException("Error");
//        System.out.println("method2 end");
    }

    private static void method3() {
        System.out.println("method3 init");
        try {
            throw new MyException("Error");
        } catch (MyException ex) {
            System.out.println("Error Treatment");
        }
        System.out.println("method3 end");
    }
}