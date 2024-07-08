package algo;

public class BinarySearch {



    public static Integer binarySearch (int[] intarr,int target){

        int min = 0;

        int max = intarr.length-1;




        while (min+1 != max){
            System.out.println("this min :"+min);
            System.out.println("this max :"+max);
            int thispart = (max+min)/2;

          if(intarr[thispart] > target){
              max=thispart-1;
          }else if(intarr[thispart] < target){
              min=thispart+1;
          }else {
              return thispart;
          }


        }
        if(intarr[min] == target){
            return min;
        }
        if(intarr[max] == target){
            return max;
        }




        return -1;
    }

    public static void main(String[] args) {

       // int[] intarr = {1,2,3,6,7,9,10};
        int[] intarr = {1};
        int target = 10;
        System.out.println( binarySearch(intarr,target));


    }


}
