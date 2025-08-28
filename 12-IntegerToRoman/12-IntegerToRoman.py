# Last updated: 8/28/2025, 11:47:28 PM
class Solution:
    def intToRoman(self, num: int) -> str:
        result = ""
        mapping = [
                (1000, 'M'),
                (900, 'CM'),
                (500, 'D'),
                (400, 'CD'),
                (100, 'C'),
                (90, 'XC'),
                (50, 'L'),
                (40, 'XL'),
                (10, 'X'),
                (9, 'IX'),
                (5, 'V'),
                (4, 'IV'),
                (1, 'I'),
            ]

        for i, roman in mapping:
            while num >= i:
                num -= i
                result += roman

        return result


            # if num > 1000:
            #     num -= 1000
            #     result += "M"
            # elif num > 900:
            #     num -= 900
            #     result += ""