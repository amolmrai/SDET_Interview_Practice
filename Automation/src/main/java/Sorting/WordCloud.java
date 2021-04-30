package Sorting;

import java.util.HashMap;

// Check string should not empty
// Split string using " "
//
public class WordCloud {

    public void getWordCloud(String strTextBody){
        HashMap<String,Integer> hm = new HashMap();
        int counter = 1;
        if(null == strTextBody && strTextBody.isEmpty()){
            System.out.println("FAILED::: given string is empty");
        }
        String strTemp[]=strTextBody.split(" ");
        for (String strValue:strTemp) {
            //System.out.println("strValue "+strValue);
            String strWord = strValue.toLowerCase();
            if(hm.containsKey(strWord)){
                hm.put(strWord,(hm.get(strWord)+1));
            }else{
                hm.put(strWord,counter);
            }
        }
        for(String strKey:hm.keySet()){
            if(hm.get(strKey)>1){
                System.out.println("Duplicate word is  "+strKey+" and Counter "+ hm.get(strKey));
            }
        }
    }

    public static void main(String ebay[]){
        WordCloud wordCloud = new WordCloud();
        wordCloud.getWordCloud("Add milk and eggs add, add then  then add flour and sugar.");
        wordCloud.getWordCloud("");

    }

}
