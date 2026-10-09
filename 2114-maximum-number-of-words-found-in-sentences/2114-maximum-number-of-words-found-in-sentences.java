class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords =0;
        for(String sentence :sentences){
            int count = sentence.split(" ").length;
            maxWords=Math.max(maxWords,count);

        }
        return maxWords;
    }
}