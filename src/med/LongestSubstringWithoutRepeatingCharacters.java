package med;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        char test1='a';
        char test2 = 'a';
        System.out.println(test1 == test2);
    }
    public int lengthOfLongestSubstring(String s) {


        int max = 0;


        LinkedList<Character> linkedList = new LinkedList<>();
        for(int index=0;index<s.length(); index++){
            char now = s.charAt(index);

            if(linkedList.contains(now)){
               max = Math.max(linkedList.size(),max);
               int sameAt = linkedList.indexOf(now);
               int delCount = 0;
               while(delCount<=sameAt){
                   linkedList.pop();
                   delCount++;
               }


               linkedList.add(now);

            }else {
             linkedList.add(now);

                   if(index==s.length()-1){
                       max = Math.max(linkedList.size(),max);
                   }

            }
        }


return max;
    }
}
