package com.DataStructure.OOP;


interface First{
    default void print(){
        System.out.println("FIrst");
    }
}

interface Second{
    default void printq(){
        System.out.println("Second");
    }
}
class Test implements First,Second {

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }

    @Override
    public void print() {
        First.super.print();
        Second.super.printq();
    }
}
