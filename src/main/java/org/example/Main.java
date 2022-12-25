package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("mojtaba");
        l.add("reza");
        l.add("mojtaba2");
        l.add("reza");
        l.add("mojtaba3");
        l.stream().filter(i -> i.startsWith("mojtaba")).forEach(i ->{
            System.out.println(i);
        });
//        System.out.println("Hello world!");
    }
}