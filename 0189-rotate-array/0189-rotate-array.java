class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int l = 0, r = n - 1;
        while (l < r) {
            int t = nums[l];
            nums[l++] = nums[r];
            nums[r--] = t;
        }

        l = 0;
        r = k - 1;
        while (l < r) {
            int t = nums[l];
            nums[l++] = nums[r];
            nums[r--] = t;
        }

        l = k;
        r = n - 1;
        while (l < r) {
            int t = nums[l];
            nums[l++] = nums[r];
            nums[r--] = t;
        }
    }
}