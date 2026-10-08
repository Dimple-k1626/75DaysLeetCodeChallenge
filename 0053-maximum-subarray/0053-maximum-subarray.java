class Solution {
    public int maxSubArray(int[] nums) {
         // Maximum sum
       int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            maxSum = maxSum < sum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }
        return maxSum;
    }
}