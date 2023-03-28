package com.mycompany.lesson2;
import java.util.ArrayList;

//TODO MP: duplicate import, check  compiler warnings
import java.util.ArrayList;

//TODO MP: class names should be capitalised
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
    
    //TODO MP: can you add another function that de-duplicates
    // input collection, i.e. removes extra identical entries 
    // if there are more than one of them present?
    
    //TODO change method
    public static void process() {
        String[] array = {"hello", "hello", "big", "big","hello", "sell", "sell"};
        ArrayList <String> sortArray = deleteDouble(array);
        for(String s : sortArray) {
            System.out.println(s);
        }
    }
}
