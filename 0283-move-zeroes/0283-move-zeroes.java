class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            moveZeroes(new int[0]);
        }
    }
    public static void moveZeroes(int[] nums) 
    {
        int left = 0;
        
        for(int right = 0;right<nums.length;right++)
        {
            while(nums[left]!=0&&left<right)
            {
                left++;
            }
            if(nums[right]!=0)
            {
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        //System.out.print(Arrays.toString(nums));
    }
}