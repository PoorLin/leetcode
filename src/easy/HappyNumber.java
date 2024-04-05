package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

        public static boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
      return isHappyInside2(n,set);
        }
        public static boolean isHappyInside(int n,Set<Integer> orgin){
            if( n == 1){
                return true;
            }else if(orgin.contains(n)){
                return false;
            }
            else {
                Integer now=n;
                String nowString=now.toString();
                int sum = 0;
                for(int index = 0 ; index<nowString.length();index++){
                    int nowInt =   Integer.parseInt(String.valueOf(nowString.charAt(index)));

                    sum+=nowInt*nowInt;
                }

                orgin.add(now);
                return isHappyInside(sum,orgin);

            }

        }


    public static boolean isHappyInside2(int n,Set<Integer> orgin){
        if( n == 1){
            return true;
        }else if(orgin.contains(n)){
            return false;
        }
        else {
            Integer now=n;
            orgin.add(now);
            int sum = 0;
            while(n>0){
                int dit = n % 10;
                sum += Math.pow(dit,2);
                n=n/10;
            }



            return isHappyInside2(sum,orgin);

        }

    }

}
