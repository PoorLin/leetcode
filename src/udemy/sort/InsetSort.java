package udemy.sort;

public class InsetSort {
    public static void main(String[] args) {
        int[] arr = {3,22,11,55,38,123,565,11,2,3434};
        insertSort(arr);
    }

    public static void insertSort(int[] targetArr){
        int arrLen = targetArr.length;
        int[] sortArr = null;

        sortArr = new int[arrLen];
        sortArr[0] = targetArr[0];
        int compareIndex = 1;
        for(int newArrIndex = 1;newArrIndex<arrLen;newArrIndex++){
            int targetValue = targetArr[newArrIndex];


            for(int nowCompare = 0;nowCompare<compareIndex;nowCompare++){
             int compareValue = sortArr[nowCompare];
             if(targetValue<compareValue){
                 sortArr[compareIndex] = compareValue;
                 sortArr[nowCompare] = targetValue;
                 targetValue = compareValue;

             }else {
                 sortArr[newArrIndex] = targetValue;
             }



            }
            compareIndex++;
        }


        for(int a= 0;a<arrLen;a++){
            System.out.println(sortArr[a]);
        }


    }

}
