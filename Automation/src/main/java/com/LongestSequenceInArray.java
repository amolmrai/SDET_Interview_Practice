package com;

import java.util.*;

public class LongestSequenceInArray {

    public static HashMap getLongestSequenceInSortedArray(int [] num){
        // Iterate array and add into TreeSet
        // Iterate array again
        // Initialise CN = array[i] and CS = 1;
        // Check if array of i-1 is exist in TreeSet
        // if  exist then don't do any thing
        // if not then CN ++ and SC ++
        Set<Integer> ts = new TreeSet<>();
        HashMap <Integer, List<Integer>> hp = new HashMap();
        List<Integer> sl=null;
        int cs=0,ls=0,cn=0;
        for(int i : num){
            ts.add(i);
        }
        for(int i=0;i<num.length;i++){
            if(!ts.contains(num[i]-1)){
               sl = new ArrayList<>();
                cs=1;
                cn=num[i];
                while(ts.contains(cn+1)){
                    sl.add(cn);
                    cs = cs+1;
                    cn = cn+1;
                }
            }
            if(ls<cs){
                hp.put(cs,sl);
            }
            ls = Math.max(ls,cs);
        }
        return hp;
    }



    public static int getLongestSequenceInArray(int [] num){
        int cs=0,ls=0,cn=0;
        for(int i=0; i<num.length;i++){
            if(i!=num.length-1){
                cn = num[i];
                if(cn==num[i+1]-1){
                   cs = cs+1;
                }else{
                    ls = Math.max(ls,cs);
                    cs = 0;
                }
            }
            ls = Math.max(ls,cs);
        }
        return  ls+1;
    }

    public static void main(String arg[]){
        int [] num = {99};
        System.out.println("Longest sequence is "+getLongestSequenceInArray(num));
       // HashMap map = getLongestSequenceInSortedArray(num);
        //int maxValueInMap=(Collections.max(map.values()));
         //System.out.print("Longest sequence is "+map);
    }
}
