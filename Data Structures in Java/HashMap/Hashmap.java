package com.company;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100,"Giroud");
        map.put(101,"Pulisic");
        map.put(103,"Zouma");
        map.put(104,"Werner");
        map.put(105,"Kepa");
        map.put(106,null);
        map.put(null,null);

        System.out.println(map);
        map.remove(null);
        System.out.println(map);

        var value = map.get(105);
        System.out.println(value);

        System.out.println(map.containsKey(103));         // O(1)
        System.out.println(map.containsValue("Werner")); //  O(N)
        System.out.println();

        // If you want to iterate over map i.e. iterate over all the keys.
        // keySet let us iterate over all the keys.

        for (var item : map.keySet()){
            System.out.println(item);
        }
        // entrySet let us iterate over all the key values pairs.
        for (var item : map.entrySet()){
            System.out.println(item);
        }

    }
}