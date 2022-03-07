package com;

public class primeNumber {

    // first 10 prime numbers
    // N till prime
    // iterate till N
    // condition :-
        // N % 1 = 0 its prime number
        // N % N = 0 its prime number
        // 5 % 2 =  1 Not prime
        // N % 0 ==  its not prime number.

        // Counter = index
        // while(Counter == 10)
        // condition :-
    //        // N % 1 = 0 its prime number
    //        // N % N = 0 its prime number
    //        // 5 % 2 =  1 Not prime
    //        // N % 0 ==  its not prime number.
    //


    public static void main (String arg[]){
        int counter =1;
        int n = 1;
        while(counter <=10){
            if (n%2==0){
                System.out.println("Prime number is "+ n);
                counter++;
            }
            n++;
        }

    }
}
