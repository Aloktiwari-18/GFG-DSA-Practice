class Solution {
    public static int maxProfit(int[] prices) {
        // code here
        int firstBuy=Integer.MIN_VALUE;
        int firstSell= 0;
        int secondBuy= Integer.MIN_VALUE;
        int secondSell= 0;
        int n= prices.length;
        
        for(int i=0;i<n;i++){
            firstBuy=Math.max(firstBuy, -prices[i]);
            firstSell= Math.max(firstSell, prices[i]+firstBuy);
            secondBuy= Math.max(secondBuy, firstSell-prices[i]);
            secondSell= Math.max(secondSell, prices[i]+secondBuy);
            
        }
        return secondSell;
        
        
    }
}
