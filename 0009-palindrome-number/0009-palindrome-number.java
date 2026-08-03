class Solution {
    public boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while(n > 0){
            int remainder = n % 10;
             reversed=(reversed * 10) + remainder;
            n = n/10;
        }
        return original == reversed;
        
    }
}