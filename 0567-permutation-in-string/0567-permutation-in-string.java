class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()){
            return false;
        }
        int[]s1freq = new int [26];
        int []s2freq = new int[26];
        for(int i =0;i<s1.length();i++){
            s1freq[s1.charAt(i) -'a']++;}
            int left =0;
            for(int right = 0;right< s2.length();right++){  
            s2freq[s2.charAt(right)-'a']++;
        
            if (right - left + 1 > s1.length()) {
                s2freq[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(s1freq, s2freq)) {
                return true;
            }
        }
        return false;

    }
}
    
