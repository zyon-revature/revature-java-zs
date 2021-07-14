package com.revature;


public class TestFib{
    public static void main(String[] args) {
        Fib fib = new Fib();

        int result = fib.fibonacci(2);
        System.out.println(result);

        result = fib.fibonacci(5);
        System.out.println(result);

        result = fib.fibonacci(10);
        System.out.println(result);

        // Try it with a HashMap
        Fib2 fib2 = new Fib2();

        int result2 = fib2.fibonacci(2);
        System.out.println(result2);

        result2 = fib2.fibonacci(5);
        System.out.println(result2);

        result2 = fib2.fibonacci(10);
        System.out.println(result2);

    }

}
