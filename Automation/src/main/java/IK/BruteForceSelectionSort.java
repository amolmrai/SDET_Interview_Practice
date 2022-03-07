package IK;

import java.util.Arrays;

public class BruteForceSelectionSort {
    /* Given an array num[5,2,4,1,3] need to sort in ascending order
    * scan the array till n-1
    * find the smallest number as minvalue
    * Swap with index and minvalue
    * return num.
    * For i in 0 to n-1
    *   minvalue = num[i];
    *   minIndex = 0;
    *
    *   For read num from i+1 to n-1
    *       if num[i] < minvalue
    *           minvalue = num[i]
    *           minindex = i;
    *       Swap num[i],num[minindex];
    *
    *  return num;
    * */


    public static int [] SelectionSort(int num[]){
        int minValue =0;
        for(int i=0;i<num.length;i++){
            for(int j = 0;j<num.length;j++) {

                if (num[i] < num[j]) {

                    minValue = num[i];
                    num[i] = num[j];
                    num[j] = minValue;
                }
            }
        }
        return num;
    }

    public static void main(String arg[]){
        int numberArray[] = {5,2,4,1,3};
        System.out.println(Arrays.toString(SelectionSort(numberArray)));
    }

}
