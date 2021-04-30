package Sorting;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicate {


    public static void removeDuplicate(int num){
        String strNum = num+"";
        System.out.println("Actual String "+strNum);
        char stringArray[]=strNum.toCharArray();
        Set<String> uniqueString = new TreeSet<String>();
        for (char ch :stringArray) {
            //uniqueString.contains(ch+"");
            uniqueString.add(ch+"");
        }
        System.out.println("UniqueString "+uniqueString+"");

    }

    public static void findDuplicate(String num){
        String strNum = num+"";
        System.out.println("Actual String "+strNum);
        char strToArray[] = strNum.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        int counter = 1;
        for (char ch :strToArray ){
            if(hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch)+1);
            }else
            {
                hm.put(ch, counter);
            }
        }
        System.out.println("Duplicate "+hm);
        for(char key:hm.keySet()){
        //for(Map.Entry<Character,Integer> entry :hm.entrySet()){
            if(hm.get(key)>1){
                System.out.println("Duplicate Key "+key+" Count "+hm.get(key));
            }
        }
    }

    public static void main(String amol[]){
        //FindDuplicate.removeDuplicate(12234);
        FindDuplicate.findDuplicate("AAAmml");
    }
}
