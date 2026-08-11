class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start =0;
        int total = 0;
        int current =0;
        for(int i = 0;i<gas.length;i++){
            int difference = gas[i]-cost[i];
            total += difference ;
            current += difference ;
            if(current<0){
                start = i+1;
                current =0;
            }
        }
        if(total<0){
            return -1;
        }
        return start;
    }
}