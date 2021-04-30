// Java program to count occurrences
// of an element
package Sorting;

import java.util.Arrays;

public class CountOccurrences {

    public static int countOccurrences(int numArr[],int arrLength,int numX){

        int res = 0;
        if (arrLength < 1){
            return -1;
        }
        Arrays.sort(numArr);
        System.out.println("Array "+numArr);
        for(int i=0;i<arrLength;i++){
            if(numArr[i]==numX){
                res++;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        int arr[] = { 2,8, 2, 2,1, 2, 3, 4, 7 ,8  };
        int n = arr.length;
        int x = 8;
        System.out.println("The occurrence of "+x +" is "+countOccurrences(arr, n, x));
    }
}
