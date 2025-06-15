// Last updated: 6/15/2025, 5:28:06 PM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        long sum = 0;
    
        for(int i = 0;i<k;i++)
        {
            int index = gifts.length - 1;
            gifts[index] = (int) Math.floor(Math.sqrt(gifts[index]));
            Arrays.sort(gifts);


        }
        for(int gift:gifts)
        {
            sum += gift;
        }
        return sum;
    }
}