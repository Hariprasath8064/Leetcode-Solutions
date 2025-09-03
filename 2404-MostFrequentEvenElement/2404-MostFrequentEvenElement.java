// Last updated: 9/3/2025, 11:42:11 PM
class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> count = new HashMap<>();
        int maxfreq = -1;
        int curfreq = 0;
        for(int num :  nums){
            if(num % 2 == 0){
                count.put(num,count.getOrDefault(num,0) + 1);
            }
        }
        for(int key:count.keySet()){
            if(count.get(key) > curfreq){
                maxfreq = key;
                curfreq = count.get(key);
            }
            else if(count.get(key) == curfreq){
                maxfreq = Math.min(maxfreq,key);
            }
        }
        return maxfreq;
    }
}