package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(23);
        list.addLast(24);
        list.add(25);
        System.out.println(list);

        System.out.println("Does the list contains 24? "+list.contains(24));

        System.out.println("Index of 24 is : "+list.indexOf(24));

        var arr = list.toArray(); // Convert linkedlist to array.
        System.out.println(Arrays.toString(arr));

    }
}

