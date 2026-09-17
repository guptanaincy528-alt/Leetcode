class Solution {
    public int deleteAndEarn(int[] nums) {

        int maxNum = 0;

        
        for (int x : nums) {
            maxNum = Math.max(maxNum, x);
        }

        int[] points = new int[maxNum + 1];

        for (int x : nums) {
            points[x] += x;
        }

        
        int[] dp = new int[maxNum + 1];

        dp[0] = 0;
        dp[1] = points[1];

        for (int i = 2; i <= maxNum; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }

        return dp[maxNum];
    }
}