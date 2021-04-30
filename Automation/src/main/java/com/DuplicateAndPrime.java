package com;

import java.util.Set;
import java.util.TreeSet;
public class DuplicateAndPrime {
    static int  i = 2 ;
    public static  Integer getDuplicatePrime(String strNum){
        int duplicateAndPrime =0;
        Set<Character> up = new TreeSet<>();
        if(strNum.isEmpty()){
            return duplicateAndPrime;
        }else{
            // Convert stringNum into Array
            char [] stringNumArray = strNum.toCharArray();
            for(char s :stringNumArray){
                if(up.contains(s)){
                    // Call isPrime()
                    if(isPrime(Integer.parseInt(s+""))){
                        System.out.println("Duplicate Prime number is "+s);
                        return duplicateAndPrime = Integer.parseInt(s+"");
                    }
                }else {
                    up.add(s);
                }
            }
        }
        return duplicateAndPrime;
    }
    public static boolean isPrime(int n){

        if(n == 0 || n== 1)
        return false;
        if(n==i)
            return true;
        if(n % i == 0)
            return false;

        i++;
    return isPrime(n);
    }
    public static void main(String amol[]){
        isPrime(5);
        getDuplicatePrime("175234757");
    }
}
