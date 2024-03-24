import java.util.Scanner;

public class BuyAndSellStocks {
  public static void main(String[] args) {
      System.out.println("Buy and sell stocks");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] prices = new int[n];
      for (int i = 0; i < n; i++) {
          prices[i] = sc.nextInt();
      }
      sc.close();
      System.out.println(maxProfit(prices));
  }
  public static int maxProfit(int[] prices) {
       int minPrize=Integer.MAX_VALUE;
       int maximumProfit=0;
       int len= prices.length;
       for(int i =0;i<len;i++){
            minPrize=Math.min(minPrize,prices[i]);
            maximumProfit=Math.max(maximumProfit,prices[i]-minPrize);
       }  
       return maximumProfit;
    }
}
