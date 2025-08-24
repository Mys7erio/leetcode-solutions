# Last updated: 8/24/2025, 11:28:29 PM
class Solution:
    def tribonacci(self, n: int) -> int:
        tribonacci = [0, 1, 1]
        if n == 1 or n == 2: return 1
        for i in range(n-3):
            tribonacci.append(sum(tribonacci[-3:]))
            tribonacci = tribonacci[-3:]
        return sum(tribonacci[-3:n])