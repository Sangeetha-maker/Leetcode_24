class Solution {
    public int maxSubArray(int[] nums) 
    {
        int curs = nums[0];
        int maxs = nums[0];
        for(int i=1;i<nums.length;i++)
        {
           curs = Math.max(nums[i],nums[i]+curs);
           maxs = Math.max(maxs,curs);
        } 
        return maxs;  
    }
}
