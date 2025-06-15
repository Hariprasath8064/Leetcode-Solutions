// Last updated: 6/15/2025, 5:28:08 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) 
    {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int sum = 0;
        for(int i : banned)
        {
            if(i <= n)
            {
                set.add(i);
            }
        }

        for(int i = 1; i <= n;i++)
        {
            if(!set.contains(i) && sum + i<= maxSum)
            {
                sum += i;
                count++;
            }
            
        }

        return count;



        
        
    }
}