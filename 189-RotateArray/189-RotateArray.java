// Last updated: 8/24/2025, 11:28:39 PM
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length > k) {
            reverse(nums, 0, nums.length -1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length -1);
            printArr(nums);
        }
    }

    static void printArr(int arr[]) {
        for (int n: arr) {
            System.out.println(n);
        }
    }

    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}