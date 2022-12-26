package solution.array.easy;
/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
You need to maintain two pointer first pos and second pos
Run loop on array
  Check if second pointer value large from first pointer
      find max
  else update start pointer
 */

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
        System.out.println(stock.maxProfit(new int []{7,1,5,3,6,4}));
    }

    /*

    prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transactions are done and the max profit = 0.

    */
    public int maxProfit(int[] prices) {
        int max = 0 ;
        int end=1;
        int start = 0;

        while (end<prices.length){

            if(prices[start] < prices[end]){
                max = Math.max(max, prices[end]-prices[start]);
            }
            else{
                start=end;
            }

            end++;
        }

        return max;
    }
}
