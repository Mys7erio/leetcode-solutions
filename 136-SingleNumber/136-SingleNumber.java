// Last updated: 8/24/2025, 11:28:38 PM
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> occ = new HashMap<Integer, Integer>();
        int single = -1;
        for (int i: nums) {
            if (occ.containsKey(i)) {
                int currentVal = occ.get(i);
                occ.put(i, currentVal+1);
            } else{
                occ.put(i, 1);
            }
        }

        for (int i: occ.keySet()) {
            if (occ.get(i) != 2) {
                single = i;
            }
        }

        return single;
    }
}