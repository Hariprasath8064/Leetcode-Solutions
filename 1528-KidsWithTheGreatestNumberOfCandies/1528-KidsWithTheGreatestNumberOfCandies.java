// Last updated: 6/15/2025, 5:28:34 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int sorted[] = Arrays.copyOf(candies,candies.length);
        Arrays.sort(sorted);
        int max = sorted[sorted.length - 1];

        List<Boolean> result = new ArrayList<>();

        for (int i=0;i<candies.length;i++)
        {
            if(candies[i] + extraCandies>= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }

        }
        return result;


        
        
    }
}