// Last updated: 6/15/2025, 5:28:03 PM
class Solution {
    public long findScore(int[] nums) {
        
        int n = nums.length;
        long score = 0;
        Set<Integer> set = new HashSet<>();
        int [][] arr = new int [n][2];
        for(int i = 0; i< n;i++)
        {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> 
        {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        for(int i = 0;i<n;i++)
        {
            int val = arr[i][0];
            int index = arr[i][1];

            if(!set.contains(index))
            {
                score += val;
                set.add(index);
                set.add(index + 1);
                set.add(index - 1);
            }
            
        }
        return score;


    }
}