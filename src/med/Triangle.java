package med;

import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {

        // 新增一個新陣列，長度為三角形+1
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){   //執行迴圈 ， 從三角形最底層開始
            for(int j=0;j<triangle.get(i).size();j++){ // 取得三角形那row的陣列
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);  // 在這個陣列 比較n n+1 ，看誰比較小
            }
        }
        return A[0];
    }
}
