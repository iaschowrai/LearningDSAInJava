package com.DataStructure.Implementaion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Display elements
        System.out.println("ArrayList elements: " + arrayList);

        // Accessing elements
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Updating elements
        arrayList.set(1, "Grapes");
        System.out.println("Updated ArrayList: " + arrayList);

        // Removing elements
        arrayList.remove("Apple");
        System.out.println("ArrayList after removal: " + arrayList);

        // Searching elements
        String searchElement = "Banana";
        System.out.println("Index of " + searchElement + ": " + arrayList.indexOf(searchElement));

        // Size and iteration
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Iterating through elements using iterator
        System.out.print("ArrayList elements (using iterator): ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

