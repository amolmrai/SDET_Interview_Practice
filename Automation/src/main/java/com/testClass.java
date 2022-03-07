package com;

public class testClass {

    public static int test(String number){

        int res = 0;
        for (int i = 0; i < number.length(); i++) {
            res = res * 10 ;
            res = res +  number.charAt(i) - '0';
        }
        return res;

        //return str.length()+"";
    }
/*
*  str  = 8 7 6
   i    = 0 1 2
        res = res * 10 ;
   0 =   0*10 = 0
        res =+  number.charAt(i) - '0';
         0+8= res = 8

         res = res * 10 ;
   1 =  8 *10 = 80
        80+ 7 = 87

   2 =
* */

    public static void main(String str[]){
        System.out.println("======"+test("876") );


    }
}
