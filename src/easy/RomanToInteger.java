package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
      //  String s="MCMXCIV";
        String s="III";

        System.out.println(   romanToInt1(s));


    }
    public static int romanToInt(String s) {
    int val=0;
        Map<String,Integer> romanMap=new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        Map<String,Integer> bigerThanI=new HashMap<>();

        bigerThanI.put("V",5);
        bigerThanI.put("X",10);
        bigerThanI.put("L",50);
        bigerThanI.put("C",100);
        bigerThanI.put("D",500);
        bigerThanI.put("M",1000);

        Map<String,Integer> bigerThanX=new HashMap<>();
        bigerThanX.put("L",50);
        bigerThanX.put("C",100);
        bigerThanX.put("D",500);
        bigerThanX.put("M",1000);

        Map<String,Integer> bigerThanC=new HashMap<>();
        bigerThanC.put("D",500);
        bigerThanC.put("M",1000);

    for(int a=0;a<s.length();a++){
        if(s.length()==1 || a==s.length()-1){
            switch (s.charAt(a)){
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
                case 'I':

                        val=val+1;


                    break;


                case 'V':
                    val=val+5;
                    break;
                case 'X':

                        val=val+10;

                    break;
                case 'L':
                    val=val+50;
                    break;
                case 'C':

                        val=val+100;

                    break;
                case 'D':
                    val=val+500;
                    break;
                case 'M':
                    val=val+1000;
                    break;



            }
        }else {
            switch (s.charAt(a)){
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
                case 'I':
                    if(bigerThanI.containsKey(String.valueOf(s.charAt(a+1)))){
                        val=val-1;
                    }else {
                        val=val+1;
                    }

                    break;


                case 'V':
                    val=val+5;
                    break;
                case 'X':
                    if(bigerThanX.containsKey(String.valueOf(s.charAt(a+1)))){
                        val=val-10;
                    }else {
                        val=val+10;
                    }
                    break;
                case 'L':
                    val=val+50;
                    break;
                case 'C':
                    if(bigerThanC.containsKey(String.valueOf(s.charAt(a+1)))){
                        val=val-100;
                    }else {
                        val=val+100;
                    }
                    break;
                case 'D':
                    val=val+500;
                    break;
                case 'M':
                    val=val+1000;
                    break;



            }
        }






    }

return val;
    }

    public static int romanToIntBetterWay(String s) {
        int val=0;
        Map<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        for(int a=0;a<s.length();a++){
            if(a<s.length()-1 && romanMap.get(s.charAt(a))<romanMap.get(s.charAt(a+1))){
               val-= romanMap.get(s.charAt(a));
            }else {
               val+= romanMap.get(s.charAt(a));
            }
        }
return val;
    }

    public static int romanToInt1(String s) {
Map<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int intNumber=0;
for(int a=0;a<s.length();a++){


    if(a==0){
        intNumber=roman.get(s.charAt(a));

    }else {
        if(roman.get(s.charAt(a-1))<roman.get(s.charAt(a))){
            intNumber-=2*roman.get(s.charAt(a-1));
            intNumber+=roman.get(s.charAt(a));
        }else {
            intNumber+=roman.get(s.charAt(a));
        }

    }
}





return intNumber;

    }
}
