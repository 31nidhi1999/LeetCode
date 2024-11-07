/*let code problem nuber 121*/
class BestTimetoBuyandSellStock {
	
	 public static int maxProfit(int[] prices) {
        int maxProfit = 0;
		int minBuy = prices[0];
        /*boolean flag = false;
        for(int i = 0; i<=prices.length-2; i++){
            for(int j = i+1; j<=prices.length-1;j++){
                if(prices[j]>prices[i]){
                    flag=true;
                    int priceDiff = prices[j]-prices[i];
                   if(priceDiff > maxProfit){
                        maxProfit = priceDiff;
                   }
                }
            }
        }
        if(flag==true){
            return maxProfit;
        }else{
            return 0;
        }*/
		
		//optimized
		
		for(int i=1;i<prices.length;i++){
			minBuy = Math.min(minBuy,prices[i]);
			int priceDiff = prices[i]-minBuy;
			maxProfit = Math.max(priceDiff,maxProfit);
		}
		return maxProfit;
    }
	
	public static void main(String[] args){
		
		int[] arr={886,729,539,474,5,653,588};
		System.out.println(maxProfit(arr));
	}
	
   
}