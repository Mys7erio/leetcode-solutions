# Last updated: 8/24/2025, 11:28:40 PM
# 5 2 7 4 3 1

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        sell = prices[0]
        maxProfit = 0

        for i in range(1, len(prices) - 1):
            print(sell, buy)
            if prices[i] < buy:
                buy = prices[i]
                sell = prices[i]

            sell = max(sell, prices[i])
            maxProfit = max(maxProfit, sell - buy)
            
        print(sell, buy)
        sell = max(sell, prices[-1])
        maxProfit = max(maxProfit, sell - buy)
        return maxProfit

        