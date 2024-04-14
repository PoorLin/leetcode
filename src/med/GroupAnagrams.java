package med;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        groupAnagrams(new String[]{"","b"});

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();

        for (String s : strs) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String key = String.valueOf(sArr);

            groupMap.putIfAbsent(key, new ArrayList<>());
            groupMap.get(key).add(s);
        }

        return new ArrayList<>(groupMap.values());
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//    List<List<String>> result =new ArrayList<>();
//
//
//          for(int index=0;index<strs.length;index++){
//              int strB= 0;
//              List<String> nowList =new ArrayList<>();
//              if( strs[index] ==null){
//                  continue;
//              }
//                 String nowStr = strs[index];
//                 nowList.add(nowStr);
//                 Map<Character,Integer> map = new HashMap<>();
//
//                 for(int strIndex = 0 ; strIndex<nowStr.length();strIndex++){
//                     char nowChar=nowStr.charAt(strIndex);
//                     if(map.containsKey(nowChar)){
//                         map.put(nowChar,((map.get(nowChar))+1));
//                     }else {
//                         map.put(nowChar, 1);
//                     }
//                     strB+= Character.getNumericValue(nowChar);;
//                 }
//
//
//              for(int inner=index+1;inner<strs.length;inner++){
//                  int innerCharInt=0;
//                  if( strs[inner] ==null){
//                      continue;
//                  }
//                  Map<Character,Integer> tmp =  new HashMap<>();
//
//                  String innerStr = strs[inner];
//
//                  for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                      Character key = entry.getKey();
//                      Integer value = entry.getValue();
//                      tmp.put(key,value);
//                  }
//                  boolean isNotContain =false;
//
//                  for(int strIndex = 0 ; strIndex<innerStr.length();strIndex++){
//                      char innerChar=innerStr.charAt(strIndex);
//                      if(tmp.containsKey(innerChar)){
//
//                          tmp.put(innerChar, (tmp.get(innerChar))-1);
//                      }else {
//                          isNotContain=true;
//                         break;
//                      }
//                      innerCharInt+= Character.getNumericValue(innerChar);;
//                  }
//                  if(innerCharInt!=strB){
//                      continue;
//                  }
//                  if(isNotContain){
//                      continue;
//                  }
//
//                  for (Map.Entry<Character, Integer> entry : tmp.entrySet()) {
//                      Character key = entry.getKey();
//                      Integer value = entry.getValue();
//                  }
//                  boolean isTheSame=true;
//                  for(Integer value: tmp.values()){
//                      if(value !=0){
//                          isTheSame=false;
//                          break;
//                      }
//                  }
//                  if(isTheSame){
//                      strs[inner] =null;
//                      nowList.add(innerStr);
//                  }
//
//              }
//
//              result.add(nowList);
//          }
//
//
//return result;
//    }

}
