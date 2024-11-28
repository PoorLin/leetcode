package udemy.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,22,11,55,38,123,565,11,2,3434};
        selectSort(arr);
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }

    public static void selectSort(int[] tarArr){
        int len =tarArr.length;


        for(int nowSelectedIndex = 0;nowSelectedIndex<len-1;nowSelectedIndex++){ //目前選擇的index
         int nowSmallest = Integer.MAX_VALUE;
         int index = 0;
            for(int nowCompareIndex = nowSelectedIndex;nowCompareIndex<len;nowCompareIndex++){
                int nowCompareNum = tarArr[nowCompareIndex];
                if(nowCompareNum < nowSmallest){
                    nowSmallest = nowCompareNum;
                    index = nowCompareIndex;
                }


            }

            if(index!=nowSelectedIndex){
                int nowSelectedNum = tarArr[nowSelectedIndex];
                tarArr[nowSelectedIndex] = tarArr[index];
                tarArr[index] =nowSelectedNum;
            }




        }




    }

}
