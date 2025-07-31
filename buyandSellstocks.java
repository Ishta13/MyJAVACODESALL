import java.util.*;
public class buyandSellstocks {
    public static int bestTime(int prices[]){
        int buy_stocks = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i=0;i<prices.length;i++){
            if (buy_stocks<prices[i]){
                int profit = prices[i] - buy_stocks;
                maxprofit = Math.max(profit,maxprofit);
            }
        else{
            buy_stocks = prices[i];           
        }
    }
      return maxprofit;
    }
    public static void main(String[] args) {
        int stocks[] = {7,3,2,1,8,9};
        System.out.println(bestTime(stocks));
    }
    
}
