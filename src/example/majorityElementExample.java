package example;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class majorityElementExample {
    public static int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }
    static int helper(int[] nums, int si, int ref){
        int c=0;
        for(int i=si;i<nums.length;i++){
            if(nums[i]==ref)
                c++;
            else
                c--;
            if(c==-1)
                return helper(nums,i,nums[i]);
        }
        return ref;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int[] nums=new int[s.length];
        for(int i=0;i<s.length;i++){
            System.out.println("test"+ Integer.parseInt(s[i]));
            nums[i]=Integer.parseInt(s[i]);
        }
        majorityElement(nums);
    }
}