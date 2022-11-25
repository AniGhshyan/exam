package com.example.exam.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DuplicatedString {

    public static Map<String, Integer> countNames(List<String> names) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            if (map.get(name) == null) {
                map.put(name, 1);
            } else {
                int count = map.get(name);
                map.put(name, ++count);
            }
        }
        return map;
    }

    public static void main(String[] args) {
       List<String> names=new LinkedList<>();
       names.add("poxos");
       names.add("petros");
       names.add("poxos");
       names.add("martiros");
       names.add("martiros");

        Map<String, Integer> map = countNames(names);
        System.out.println(map);
    }


}
