package easy;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

       int[] nums1 ={1,2,3,0,0,0};
       int m = 3;
       int[] nums2 = {2,5,6};
       int n = 3;
       merge3(nums1,m,nums2,n);

        for (int a:nums1
             ) {
            System.out.println(a);

        }


    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //先將number 2 放進nums1裡面再藉由Array寫好的sort方法進行排序

        for(int nums1zero=nums1.length-n,nums2Locate=0;nums1zero<nums1.length;nums1zero++,nums2Locate++){
         nums1[nums1zero]=nums2[nums2Locate];
        }
       Arrays.sort(nums1);
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int[] temp=nums1.clone();
        int tempLocate=0,nums2Locate=0,resultLocate=0;
        while(tempLocate<m || nums2Locate<n){
            if(tempLocate<m && nums2Locate<n){

                if (temp[tempLocate] < nums2[nums2Locate]) {
                    nums1[resultLocate++] = temp[tempLocate++];
                } else {
                    nums1[resultLocate++] = nums2[nums2Locate++];
                }
            }
            else if(tempLocate==m){
                nums1[resultLocate++] = nums2[nums2Locate++];
            }else {
                nums1[resultLocate++] = temp[tempLocate++];
            }
        }
    }

    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        //question 將兩個integer 合併再一起

        if(m>0 && n>0){
       int length=nums1.length;
       int[] tmpNum=nums1.clone();
       int tmpm=0;
       int tmpn=0;
   while(tmpm+tmpn<length){
      if(tmpNum[tmpm]>nums2[tmpn]){
          nums1[tmpm+tmpn]=nums2[tmpn];
          tmpn++;
      }else {
          nums1[tmpm+tmpn]=nums1[tmpm];
          tmpm++;
      }

       System.out.println(tmpm+" "+tmpn);
   }


        }else if(m>0 && n==0){


        } else if (m==0 && n>0) {
            for (int index=0;index<n;index++){
                nums1[index]=nums2[index];
            }

            }

        }




}
