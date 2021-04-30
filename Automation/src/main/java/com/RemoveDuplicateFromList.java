package com;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void getRemoveDuplicateFromList(List<Integer> list){
        //Iterate List and add into TreeSet.
        Set<Integer> uniqueList = new TreeSet<Integer>();
        for(int i : list){
         uniqueList.add(i);
        }
        uniqueList.stream().forEach(l->System.out.print(l));
    }
    public static void main(String arg[]){
        List ll = new ArrayList(Arrays.asList(1,2,3,1,4,2,5)) ;
        getRemoveDuplicateFromList(ll);
    }
}
