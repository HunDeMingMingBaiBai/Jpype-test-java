package com.paradigm.jpype;

public class Test1 {

    public void run() {
        for (int i = 0; i < 1000000; ++i) {
            float num = 11.1f;
            num = num + 1.1f;
            num = num - 1.1f;
            num = num * 1.1f;
            num = num * 0.9f;
        }
        System.out.println("Hello World!");
    }

    public double run1(int count) {
        int N = count;
        double result = 0.0d;
        for (int i = 1; i < N; ++i) {
            double x = i;
            double y = sin(i);
            x = (x - y) * (x - y);
            result = result + x;
        }
        return result;
    }

    public double sin(int n) {
        double result = 0;
        for (int i = 1; i <= 10; ++i) {
            result = result + pow(-1, i + 1) * pow(n, 2*i -1) / factorial(2*i - 1);
        }
        return result;
    }

    public double pow(int num, int n) {
        double temp = 1.0d * num;
        double result = temp;
        for (int i = 1; i < n; ++i) {
            result = result * temp;
        }
        return result;
    }

    public double factorial(int n) {
        double result = 1.0d;
        for (int i = 1; i < n+1; ++i) {
            result = result * i;
        }
        return result;
    }
}
