// Last updated: 6/19/2025, 11:47:19 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        Set<List<Integer>> temp = new HashSet<>();


        for(int i=0; i<nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int a=i+1;
            int b=nums.length-1;
            while(a<b) {
                if(nums[i]+ nums[a]+nums[b] ==0) {
                    answer.add(Arrays.asList(nums[i], nums[a], nums[b]));
                    a++;
                    while(a<b && nums[a]==nums[a-1]){
                        a++;
                    }
                }
                else if(nums[i]+ nums[a]+nums[b]>0) {
                    b--;
                    while(a<b && nums[b]==nums[b+1]){
                        b--;
                    }
                }
                else {
                    a++;
                    while(a<b && nums[a]==nums[a-1]){
                        a++;
                    }
                }
            }
        }
        answer.addAll(temp);
        return answer;
    }
}