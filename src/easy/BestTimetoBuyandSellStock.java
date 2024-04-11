package easy;

public class BestTimetoBuyandSellStock {
    public int myMaxProfit(int[] prices) {
   //計算最大獲利 ，
        int priceLen = prices.length;
        int maxProfit = 0;
        int nowMin = 100000;
       for(int index = 0 ;index<priceLen;index++){

           int now=prices[index];
           if(nowMin>now){
               nowMin=now;
           }else {
               continue;
           }

           for(int inner = index+1 ; inner<priceLen;inner++){
               int after = prices[inner];
               int sub = after - now ;

               if(sub >maxProfit){
                    maxProfit=sub;
               }
           }
       }
       return maxProfit;
    }



    public int maxProfit(int[] prices) {
        if(prices.length ==0) {
            return 0;
        }

        int maxProfit = 0;   //宣告最大獲利
        int low = prices[0]; //宣告第一個為low(最小值)
        int high;

        for(int i = 0; i < prices.length; i++) { //迴圈
            high = prices[i]; //設定high為當前的值
            if(high > low) {  //當有人比最小值大時 ， 計算他與目前的最大獲利誰大
                maxProfit = Math.max(maxProfit, high - low);
            } else {          // 當有人比最小值小時，他為新的最小值
                low = prices[i];
            }
        }
        return maxProfit;
    }
}
