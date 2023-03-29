package com.mycompany.lesson2;
import java.util.ArrayList;


public class DeleteDoubleItems {
	
    public static ArrayList<String> deleteDouble(String[] args) {
        ArrayList <String> sortList = new ArrayList<>();
        for(String s1 : args) {
            for(String s2 : args) {
                if(s1.equals(s2) && !sortList.contains(s2)){
                    sortList.add( s2 );
                }
            }
        }
        System.out.println("test");
        return sortList;
    }
}
