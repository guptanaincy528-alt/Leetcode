class Solution {
    public int subsetXORSum(int[] nums) {
        return findSum(nums,0,0);
    }
   public int findSum(int[] nums, int index, int currentXor) {

        if (index == nums.length) {
            return currentXor;
        }

        
        int exclude = findSum(nums, index + 1, currentXor);

    
        int include = findSum(nums, index + 1,
                              currentXor ^ nums[index]);

        return exclude + include;
    }
}