class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int act = n*(n+1)/2;
        int res = 0;
        for(int tot : nums)
        {
            res += tot;
        }
        return act - res;
        
    }
}