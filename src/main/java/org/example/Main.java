package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {


//     
        //hash map
        System.out.println("----hashMap");
        Map<Long,String> m=new HashMap<>();
        m.put(1l,"23232323");
        m.put(2l,"232323");

        for(Long x:m.keySet()){
            System.out.println(m.get(x));
        }

        System.out.println("----string hashMap");
        Map<String,String> ms=new HashMap<>();
        ms.put("reza","reza1");
        ms.put("mojtaba","mojtaba1");


        System.out.println("mojtaba".hashCode());
        System.out.println("reza".hashCode());

        for(String x:ms.keySet()){
            System.out.println(ms.get(x));
        }

        //array list
        System.out.println("----array list");
        List<String> l=new ArrayList<>();
        l.add("mojtaba");
        l.add("reza");
        l.add("mojtaba2");
        l.add("reza");
        l.add("mojtaba3");

        String[] a=l.toArray(new String[l.size()]);
         for (int z=0;z < l.size() ;z++){
             System.out.println(a[z]);
         }

//         for(String s : a){
//             System.out.println(s);
//         }
//        l.stream().filter(i -> i.startsWith("mojtaba")).forEach(i ->{
//            System.out.println(i);
//        });
//        System.out.println("Hello world!");
    }
}