package sarbajit.collection;

import java.util.*;

public class TreeSetClass {

    public static void main(String[] args) {

//        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(25);
        ts.add(35);
        ts.add(45);
        ts.add(55);
        ts.add(65);

        //ts.ceiling(55);

        System.out.println(ts);

    }

}