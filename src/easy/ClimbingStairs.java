package easy;

import java.math.BigInteger;

public class ClimbingStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
       int twoTotal = n/2;
       int leftOne = n%2;
       int total =twoTotal+leftOne;
       int count = 0;

       while (twoTotal>=0){
           if(leftOne==0){
               count=count+(factorial(total).divide((factorial(twoTotal)))).intValue();

           }else if(twoTotal == 0){
               count=count+1;
           }else {
               System.out.println(total);
               System.out.println((factorial(total)));

               count=count+((factorial(total).divide((factorial(twoTotal).multiply(factorial(leftOne)))))).intValue();
           }
           twoTotal--;
           leftOne=leftOne+2;
           total=total+1;

       }
return  count;
    }

    public static BigInteger factorial(int n) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }



}
