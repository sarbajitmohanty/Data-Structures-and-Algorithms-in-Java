package sarbajit.collection;

import java.util.*;
import java.util.Map.*;

public class HashMapClass
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> tm=new HashMap<>();


        tm.put(4,"E");
        tm.put(5,"F");


        //Entry<Integer,String> e=tm.firstEntry();

        //System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(tm);

    }
}