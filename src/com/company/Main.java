package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        int a;
        a=0;
        if(a>b)
        {
        b=b+1;
        }
         */
        HashTable<String> symbolTable = new HashTable<>(7);
        List<String> list = Arrays.asList("a", "a", "0", "a", "b", "b", "b", "1");
        int index = 1;
        for (int i = 0; i < list.size(); i++) {
            symbolTable.add(list.get(i));
        }

        System.out.println(symbolTable.getSize());
        System.out.println(symbolTable.isEmpty());

        System.out.println(list);
        System.out.println(symbolTable.toString());

    }
}
