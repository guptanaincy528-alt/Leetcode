class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[]pfreq = new int [26];
        int []windowfreq = new int[26];
        for(int i =0;i<p.length();i++){
            pfreq[p.charAt(i) -'a']++;}
            int left =0;
            for(int right = 0;right< s.length();right++){  
            windowfreq[s.charAt(right)-'a']++;
        
            if (right - left + 1 > p.length()) {
                windowfreq[s.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(pfreq, windowfreq)) {
                ans.add(left);
            }
        }
        return ans;

    }
}