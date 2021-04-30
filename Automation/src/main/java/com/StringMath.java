package com;

public class StringMath {
    public static String getMathNumber(String num){
        String onlyDigit = "";
        String onlyChar= "";
        char [] charNum = num.toCharArray();
        for(char s : charNum){
            if(Character.isDigit(s)){
                onlyDigit=onlyDigit+s;
            }else{
                onlyChar=onlyChar+s;
            }
        }
        String getMathNumber = "";
        //Convert string into the int.
        int i = Integer.parseInt(onlyDigit);
        i = (i*10)/100;
        getMathNumber = i+Integer.parseInt(onlyDigit)+"";
        System.out.println("number is "+getMathNumber);
        return onlyChar+getMathNumber;
    }

    public static void main (String are[]){
        getMathNumber("Amol50000");
    }
}
