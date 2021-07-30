package com;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateString {

    public static String removeDuplicateFromString(String str){
        // Convert String into Char Array
        // Create TreeSet object
        // Iterate Char Array and add into TreeSet
        if(!str.isEmpty()){
           char charString[] = str.toCharArray();
            Set<Character> st = new TreeSet<Character>();
            for(char ch:charString){
                st.add(ch);
            }
            return st.toString();
        }
        return "";
    }

    public static void main(String arr[]){
        String uniqueString = RemoveDuplicateString.removeDuplicateFromString("apple");
        System.out.println(uniqueString);
    }
}
//Remove duplicates from a given string
// example:- apple

// Find First Character Occurrence in a String
