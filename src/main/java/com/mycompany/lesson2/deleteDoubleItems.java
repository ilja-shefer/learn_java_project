package com.mycompany.lesson2;
import java.util.ArrayList;

import java.util.ArrayList;

public class deleteDoubleItems {
    public static ArrayList<String> deleteDouble(String[] args) {
        ArrayList <String> sortList = new ArrayList<>();
        for(String s1 : args) {
            for(String s2 : args) {
                if(s1.equals(s2) && !sortList.contains(s2)){
                    sortList.add( s2 );
                }
            }
        }
        return sortList;
    }
    
    //TODO change method
    
    public static void process() {
        String[] array = {"hello", "hello", "big", "big","hello", "sell", "sell"};
        ArrayList <String> sortArray = deleteDouble(array);
        for(String s : sortArray) {
            System.out.println(s);
        }
    }
}
