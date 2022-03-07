package com;

import java.util.ArrayList;
import java.util.List;

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

        public List getStringWords(String str) {
            List<String> word = new ArrayList<>();
            if (!str.isEmpty()) {
                // Split string into array using split()
                String[] arrayString = str.split(" ");
                // Interate array
                for (String strWord : arrayString) {

                    if (strWord.contains(",")) {
                        strWord = this.removeDigit(strWord);
                        int index = strWord.indexOf(",");
                        strWord.replace(",", "");
                    }
                    if (strWord.contains(":")) {
                        strWord = this.removeDigit(strWord);
                        int index = strWord.indexOf(":");
                        strWord.replace(":", "");
                    }
                    if (strWord.contains(".")) {
                        strWord = this.removeDigit(strWord);
                        int index = strWord.indexOf(".");
                        strWord.replace(".", "");
                    }
                    if (strWord.contains("?")) {
                        strWord = this.removeDigit(strWord);
                        int index = strWord.indexOf("?");
                        strWord.replace("?", "");
                    }
                    if (strWord.contains("!")) {
                        strWord = this.removeDigit(strWord);
                        int index = strWord.indexOf("!");
                        strWord.replace("!", "");
                    }
                    word.add(strWord);
                }
            }
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


        public static String removeSpecialChar(String str){

            return str = str.replaceAll("[^a-bA-Z0-9]", " ");
        }

        public static void main (String[]args){
            RemoveSpecialCharString obj = new RemoveSpecialCharString();
            List ll =  obj.getStringWords("How many eggs are in a half-dozen, 13?");
            System.out.println("------ "+ll);
            System.out.println("with Regex:-  "+removeSpecialChar("aaaaabbbbcccdddeee?"));

        }

    }
