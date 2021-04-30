package Sorting;
/*
Write a program that, given a number n from STDIN, prints out all numbers from 1 to n (inclusive) to STDOUT,
each on their own line. But there's a catch:

For numbers divisible by 3, instead of n, print Fizz
For numbers divisible by 5, instead of n, print Buzz
For numbers divisible by 3 and 5, just print FizzBuzz
*/
public class FizzBuzzClassic {
    public static void getFizzBuzzClassic(int n){
    // n should be positive
        if(n<=0){
            System.out.println(" The number should be +ve and >0");
        }

        for(int i=1; i<=n;i++){
            // n % 3 && n % 5 == 0 => FizzBuzz
            if(i % 3 == 0 && i % 5==0){
                System.out.println("FizzBuzz");
                // n % 3 => Fizz
            }else if(i % 3 == 0){
                System.out.println("Fizz");
                // n % 5 => Buzz
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else { // if n == 1 return 1
                if (i == 1) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String arg[]){
        System.out.println("------FIZZBIZZ CLASSIC ---------");
        getFizzBuzzClassic(15);
    }

}
