class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int profit=0, buy = prices[0];
        for (int i=1;i<n;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else{
                int diff=prices[i]-buy;
                if(diff>profit){
                    profit=diff;
                }
         
            }
        }
        return profit;

    }
}     
