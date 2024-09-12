package algo;

import java.util.HashMap;

public class StringFreq {

    public static boolean strFreq(String str1,String str2){
        HashMap<Character,Integer> maps = new HashMap<>();
        int strLen =str1.length();

        for(int index = 0; index<strLen;index++){
            char thisChar = str1.charAt(index);
            if(maps.containsKey(thisChar)){
               Integer count=maps.get(thisChar);
               maps.put(thisChar,count+1);
            }else {
               maps.put( str1.charAt(index) ,1 );
            }
        }
        for(int index = 0; index<strLen;index++){
            char thisChar = str2.charAt(index);
            if(maps.containsKey(thisChar)){
                Integer count=maps.get(thisChar);
                maps.put(thisChar,count -1);
            }else {
                return false;
            }
        }

        for(Integer thisCount : maps.values()){
           if(thisCount != 0){
               return  false;
           }

        }


        return true;
    }


    public static void main(String[] args) {
char a = 'a';
char b = 'b';

BinarySearch binarySearch = new BinarySearch();
        System.out.println(a+b);

    }

}
