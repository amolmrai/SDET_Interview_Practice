package com;

public class GetOutOfAlphabeticalOrderChar {

    public static String getOutOfAlphabeticalOrderChar(String str){
        int OutOfAlphabeticalOrderCharIndex = 0;
        if(str.isEmpty())
            return "Error:- Empty string";
        if(isStringHasNumber(str))
            return "Error :- String should contain only Char ";

        char [] strArray = str.toCharArray();
        for(int i=0; i<strArray.length-1;i++){
            // str  = a b c d e a
            // i    = 0 1 2 3 4 5
            if(strArray[i]> strArray[i+1]){
                OutOfAlphabeticalOrderCharIndex =  i+1;
                break;
            }
        }
        return OutOfAlphabeticalOrderCharIndex+" and Char is :- "+strArray[OutOfAlphabeticalOrderCharIndex];
    }

    public static boolean isStringHasNumber(String str){
        boolean isStringHasNumber = true;

        int actualStrLength = str.length();
        int alphaStrLength  = str.replaceAll("[^A-Za-z]","").length();

        if(actualStrLength==alphaStrLength)
            isStringHasNumber = false;

        return isStringHasNumber;
    }


    public static void main(String xyz[]){
        String str = "abcdea0";
    System.out.println(str+" :- Out Of Alphabetical Order Char index is "+getOutOfAlphabeticalOrderChar(str));

    }

}
