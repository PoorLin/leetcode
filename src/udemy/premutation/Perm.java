package udemy.premutation;

import java.util.ArrayList;

public class Perm {

    public static ArrayList<String[]> perm=new ArrayList<>();

    public static void main(String[] args) {
      String[] target = {"A","B","C"};
      getPermRec(target,0);
      for(int index = 0;index< perm.size();index++){
          String[] arr=perm.get(index);
          for(int a = 0;a<arr.length;a++){
              System.out.print(arr[a]);
          }
          System.out.println();
      }
    }
    public static void getPerm(String[] target){
        ArrayList<String[]> perm = new ArrayList<>();






    }

    public static void getPermRec(String[] target,int start){
    int targetLen = target.length;
    if(start == targetLen){
        String[] thisOne = new String[targetLen];
        for(int a=0;a<targetLen;a++){
            thisOne[a] = target[a];
        }
      perm.add(thisOne);
    }else {
        for(int index = start;index<targetLen;index++){
            String temp = target[start];
            target[start] = target[index];
            target[index] = temp;
            getPermRec(target,start+1);

            String temp1 = target[start];
            target[start] = target[index];
            target[index] = temp1;




        }




    }





    }


}

