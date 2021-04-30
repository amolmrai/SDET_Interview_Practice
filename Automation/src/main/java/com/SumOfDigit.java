package com;

public class SumOfDigit {

    public static int getSumOfDigit(int n){
        int sum = 0;
        while(n!=0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String str[]){

        System.out.println("Sum of digit is "+ SumOfDigit.getSumOfDigit(678));

    }
}
