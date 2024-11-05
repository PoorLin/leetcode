package med;

import java.util.*;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();
        int len = height.length;
        for(int index=0;index<len;index++){

            for(int inner=index+1;inner<len;inner++){
                int min = Math.min(height[index],height[inner]);
                set.add(min*(inner-index));
                list.add(min*(inner-index));
            }
        }
        Collections.sort(list);
        for(int a:list){
            System.out.println(a);
        }
        return list.getLast();
    }
    public int bettermaxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
           // 第一次的面積是全長* min
           //
        while (left < right) {     // 最高會跑到right
            int currentArea = Math.min(height[left], height[right]) * (right - left);  //計算面積 min*長度
            maxArea = Math.max(maxArea, currentArea); //與目前最大面積相比

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
