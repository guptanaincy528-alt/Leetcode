class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check each number
        for (int num : set) {

            // num is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Check consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Store maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}