package com;

public class FindMaxElementInArray {
    public int getMaxElementInArray(int [] num){
        int maxElementInArray = 0;
        if (num.length==0){
            return 0;
        }
        int tempNumMax = num[0];
        for(int i : num){
            if(i>tempNumMax){
                tempNumMax = i;
            }
        }
        return maxElementInArray = tempNumMax;
    }

    public static void main(String nun[]){
        FindMaxElementInArray findMaxElementInArray = new FindMaxElementInArray();
        int num [] = {-1,-2,-4,-6,-10};
        System.out.println("Max Element of array is  "+findMaxElementInArray.getMaxElementInArray(num));

        //Test 1 Array should not be empty
        int empty [] = {};
        if(findMaxElementInArray.getMaxElementInArray(empty) == 0)
            System.out.println("1) Given an array is Empty! please check the array ");

        //Test 2 Array all elements should not be 0
        int negativeArray [] = {0,0,0,0};
        if(findMaxElementInArray.getMaxElementInArray(negativeArray) == 0)
            System.out.println("2) Given an array is Empty! please check the array ");

    }


}
