package ArrayMedium;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
//TC - 0(N) SC - O(1)
public class StocksBuyAndSell {
    public int maxProfit(int[] prices) {
        int minToBuy = prices[0]; //assign the first element as min
        int maxProfitToSell = 0;
        for(int i = 0; i < prices.length; i++){
            minToBuy = Math.min(minToBuy, prices[i]);
            //this will take the smallest number to buy the stock
            int profit = prices[i] - minToBuy;
            maxProfitToSell = Math.max(profit,maxProfitToSell);
        }
        return maxProfitToSell;
    }
}


/*Algorithm
buy at minimum in the whole array
compare to check we are taking a smaller number
take new variable to find our profit from substracting current price - minTobuy
the max of profit and maxProfit will be thr answer
sell at max of the array

1st take arr[0] as minsofar and compare it with

*/
