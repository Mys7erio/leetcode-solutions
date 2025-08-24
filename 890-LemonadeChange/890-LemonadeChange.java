// Last updated: 8/24/2025, 11:28:33 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five_dollars = 0;
        int ten_dollars = 0;
        int twenty_dollars = 0;

        for (int bill: bills) {
            if (bill == 5)
                five_dollars++;

            if (bill == 10) {
                if (five_dollars > 0) {
                    five_dollars--;
                    ten_dollars++;
                }
                else
                    return false;
            }

            else if(bill == 20) {
                if (ten_dollars > 0 && five_dollars > 0) {
                    ten_dollars--;
                    five_dollars--;
                    twenty_dollars++;

                } else if (five_dollars >= 3) {
                    five_dollars -= 3;
                    twenty_dollars++;
                } else
                    return false;
            }
        }

        return true;
    }
}