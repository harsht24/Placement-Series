package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(32);
        list.add(42);
        System.out.println("Size of array is : "+list.size());

        list.remove(0);
        System.out.println("After removing 1st element"+list);

        System.out.println("Size of array is : "+list.size());

        System.out.println("Is 32 present in the list : "+list.contains(32));

        Object[] arr = list.toArray();

        System.out.println(arr); //Object of array is printed.
        System.out.println(Arrays.toString(arr)); 
    }

}
