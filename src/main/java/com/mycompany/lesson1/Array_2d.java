
package com.mycompany.lesson1;


// TODO: MP: class javadocs
/**
 * Class comment
 * @author m
 */
public class Array_2d {
    // TODO: MP: method javadocs
    // TODO: MP: A good exercise would be to rewrite using Collections API,
    //     which would avoid the need for the first loop
   public static String[] lineArrayFrom2d(String[][] arr){
        //definition of length of the line array
        String[] newArr;
        int lengthOfArr = 0;
        
        for (String[] s1: arr) {
            lengthOfArr += s1.length;
        }
        
        newArr = new String[lengthOfArr];
        
        //combine all nested arrays in the line array
        int index = 0;
        for(String[] s1 : arr) {
            for(String s2 : s1) {
                newArr[index] = s2;
                index++;
            }  
        }
        
        return newArr;
    }
    
   // TODO: MP: it should be in the test Class  rather than "main",
   //       and it should be testing rather than just printing.
   //       There shouldn't be "main" methods in ordinary classes
    public static boolean isFound(String[] args) {
        String[] arr1 = {"data", "day", "month"};
        String[] arr2 = {"one", "two", "three"};
        String[] arr3 = {"bear", "rabbit", "litle", "big"};
        String[][] complexArr = {arr1, arr2, arr3};
        
        String[] oneFromThree = lineArrayFrom2d(complexArr);
        
        boolean found = false;
        for(int i = 0; i < oneFromThree.length; i++) {
            for(String s1 : args) {
                if(s1.equals(oneFromThree[i])){
                    found = true;
                    return found;
                    //oneFromThree[i] = null;
                }
            }
        }
        
        /* original code
        String ret = new String();
        for(String s1 : oneFromThree) {
            ret = ret + s1 + " ";
            //System.out.print(s1 + " ");
        }
        return ret;
*/
        return found;
    }

}
