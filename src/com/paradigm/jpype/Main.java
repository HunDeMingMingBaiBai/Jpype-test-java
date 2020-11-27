package com.paradigm.jpype;

public class Main {

    public static void main (String[] args) {
        Test1 test1 = new Test1();

        for (int i = 0; i < 10; ++i) {
            long start = System.nanoTime();
            double result = test1.run1(100000);
            long end = System.nanoTime();
            System.out.println("--- --- ---");
            System.out.println(result);
            System.out.println(end - start);
            System.out.println((end - start) / 1000000.0d);
            System.out.println("--- --- ---");
        }

    }

}
