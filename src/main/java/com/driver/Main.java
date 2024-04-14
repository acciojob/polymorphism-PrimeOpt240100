package com.driver;

public class Main {

    public static void main(String[] args){
        // Task 2
        Product p = new Product();

        int ans_1 = p.Product(10,20);
        int ans_2 = p.Product(10,20,30);
        double ans_3 = p.Product(10.20d,20.10d);
        System.out.println(ans_1 + " " + ans_2 + " " + ans_3);
    }

    // Task 1
    public static class Product {

        // Task 3
        public int Product(int x, int y) {
            return x*y;
        }

        // Task 4
        public int Product(int x, int y, int z) {
            return x*y*z;
        }

        // Task 5
        public double Product(double x, double y){
            return x*y;
        }

    }
}