// Last updated: 8/24/2025, 11:28:41 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // First and last elements of each row are always 1
                if (j == 0 || j == i) {
                    innerList.add(1);
                } else {
                    // Sum of the two elements above
                    int sum = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    innerList.add(sum);
                }
            }
            list.add(innerList);
        }

        return list;
    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        int numRows = 5; // Change this value to print more rows of Pascal's Triangle
        List<List<Integer>> pascalTriangle = soln.generate(numRows);

        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
