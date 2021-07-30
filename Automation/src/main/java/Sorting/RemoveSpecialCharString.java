package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharString {

        // Split string into array using split()
        // interate array
        // check the special char in each word. if yes then remove.
        // Check the numeric string also.
        //Test cases:
        // 1) String should not be empty
        // 2) String cotains special char (,.!:)
        // 3) String cotains (Numeric)
        // 4) Multi spaces.
        // 5) how big string
        // 6) if string single char.
        // 7) return type should be list of words.
        // 8) if stiring with all special char.
        // 9) send string with '-' it should not remove.
        // 10) send all numeric string.

        public String getStringWords(String str) {
           String  word = new String();
            // Create a regular expression
            //String regex = "[^A-Za-z]+(\s)";
            String regex = "^([a-zA-Z])+(\\s)+[a-zA-Z]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            return matcher.replaceAll("");

        }

        public String removeSpecialChar(String str){
            String  word = new String();

            return word;
        }

        public String removeDigit(String strword){
            //conver string into charArray
            // check if char is digit
            String tempWord = "";
            char [] charWord = strword.toCharArray();
            for(char ch : charWord){
                if(!Character.isDigit(ch)){
                    tempWord = tempWord+ch;
                }
            }
            return tempWord;
        }

        public static void main (String[]args){
            RemoveSpecialCharString obj = new RemoveSpecialCharString();
           String result =   obj.getStringWords("How many:. eggs: are. in a half-dozen, 13?");
            System.out.println("------ "+result);
        }

    }
