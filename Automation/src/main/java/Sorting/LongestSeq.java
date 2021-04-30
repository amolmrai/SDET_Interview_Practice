package Sorting;

import java.util.HashSet;

public class LongestSeq {


    public static void main (String[] args)
    {
        int arr[] = { 1, 2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6 };
        //int arr[] = { 1, 2, -3, 2, 1, 2, 3 };
        int n = arr.length;
        getLongestSeq(arr);
    }

    public static void getLongestSeq(int[] num) {

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int k = 0; k < num.length; k++)
        {
            // add array into Hashset
            hs.add(num[k]);
        }
        int long_seq = 0;
        for(int i :num){
            if(!hs.contains(i-1)){
              int no = i;
              while(hs.contains(no)){
                  no++;
              }
              if(long_seq < no-i){
                long_seq= no-num[i];
              }
            }
        }
        System.out.println( "Length " + long_seq) ;

    }
}
