# Last updated: 8/27/2025, 11:19:58 PM
class Solution:
    def myPow(self, x: float, n: int) -> float:
        result = 1
        n_copy = abs(n)

        # for _ in range(0, abs(n)):
        #     if n > 0:
        #         result *= x
        #     else:
        #         result *= 1/x

        while (n_copy > 0):
            if n_copy % 2 == 0:
                x = x * x
                n_copy = n_copy / 2
            else:
                result = result * x
                n_copy -= 1

        return float(result) if n > 0 else float(1 / result)