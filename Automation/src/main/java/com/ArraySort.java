package com;
import java.util.HashSet;
import java.util.Set;

public class ArraySort {

    public  void findDuplicate1(int nums[]){
        int duplicateNum = -1;
        if(nums.length == 0){
            System.out.print("Empty array");
        }

        //char ch[] = nums.toString().toCharArray();
       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1; j<nums.length;j++){
            if(nums[i] == nums[j]){
                System.out.print(nums[i]);
            }
        }
       }
    }

    public static void main(String arr[]){
        int[] array = new int[]{50, 50, 501, 520, 530,530 };
    new ArraySort().findDuplicate1(array);
    }


    public static class ArrayCalulation {

        public  static  void findDuplicate(int [] nums) {
            int i =0;
            Set unique = new HashSet();
            int index = 0;
            for(int j :nums){
                if(!unique.contains(j)){
                    unique.add(j);
                }else
                    System.out.println("index of duplicate element is "+index+" and Value is "+j);
                index++;
            }
        }
        public static void main (String arr[] ){
             int[] array= new int[]{50, 50, 501, 520, 530,530 };
            ArrayCalulation.findDuplicate(array);
        }
    }
}
