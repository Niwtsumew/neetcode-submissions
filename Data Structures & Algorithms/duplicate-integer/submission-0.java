class Solution {
    public boolean hasDuplicate(int[] nums) {
        int steps = 1;
        for(int i = 0; i < nums.length; i++) 
        {
            for(int j = steps; j < nums.length; j++) 
            {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
            steps++;
        }
        return false;
    }
}