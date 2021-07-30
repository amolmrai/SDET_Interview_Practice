package Sorting;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondRepetedChar {

    public static String getSecondRepeatedChar(String []arrayOfChar,int n){
        Set<String> ts = new TreeSet<String>();
        int count=1;
        String SecondRepeatedChar = "";
        String ArrayString = Arrays.toString(arrayOfChar);
        for(String c : arrayOfChar){
            if(ArrayString.indexOf(c) != ArrayString.lastIndexOf(c)){
                ts.add(c);
            }
        }
        System.out.println("Repeated Tree Set is "+ts);
        for(String s :ts){
            if(count == n){
                SecondRepeatedChar = s;
            }
            count ++;
        }
        return  SecondRepeatedChar;
    }


    public static void main(String arg[]){
        String [] CharArray = {"A","B","B","C","A","B","C","D"};
        System.out.println("Actual Array "+ CharArray);
        System.out.println("Second repeated Char is "+SecondRepetedChar.getSecondRepeatedChar(CharArray,2));
    }
}
