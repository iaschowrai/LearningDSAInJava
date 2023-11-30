package com.DataStructure.OOP;

public class TestOne {
    int x = m1();
    int m1(){
        System.out.println("in m1 method");
        return 10;
    }
    TestOne(){
        System.out.println("in Constructor");
    }

    public static void main(String[] args) {
        new TestOne();
    }
}
