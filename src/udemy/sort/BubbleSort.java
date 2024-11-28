package udemy.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,22,11,55,38,123,565,11,2,3434};
         sort(arr);
        for(int a= 0;a<arr.length;a++){
            System.out.println(arr[a]);
        }


    }

    public static void sort(int[] targetArr){
        int arrLen = targetArr.length;

        for(int fixedIndex = 0;fixedIndex < arrLen-1;fixedIndex++){
            int fixedNum = targetArr[fixedIndex];

            for(int movingIndex = fixedIndex+1;movingIndex<arrLen;movingIndex++){
             int movingNum = targetArr[movingIndex];

             if(movingNum<fixedNum){
                 System.out.println("found!! movingindex:"+movingIndex+"fixInd:"+fixedIndex);
                 System.out.println("found!! moving:"+movingNum+"fixNUm:"+fixedNum);
                 targetArr[movingIndex] = fixedNum;
                 fixedNum = movingNum;
                 targetArr[fixedIndex] = movingNum;

             }
            }
        }



    }




}
