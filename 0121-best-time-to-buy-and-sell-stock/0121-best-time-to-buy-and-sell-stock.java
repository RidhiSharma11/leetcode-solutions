class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
            int profit=prices[i]-buyPrice;
            max=Math.max(max,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return max;
    }
}