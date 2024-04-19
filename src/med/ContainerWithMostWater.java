package med;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

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
