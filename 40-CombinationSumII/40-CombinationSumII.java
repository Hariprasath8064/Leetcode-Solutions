// Last updated: 8/6/2025, 12:45:24 AM
class Solution {
    private void permute(int[] array,List<List<Integer>> ans,List<Integer> temp, boolean[] map){
        if(temp.size() == array.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i < array.length;i++){
            if(!map[i]){
                map[i] = true;
                temp.add(array[i]);
                permute(array,ans,temp,map);
                temp.remove(temp.size() - 1);
                map[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean map[] = new boolean[nums.length];
        permute(nums,res,temp,map);
        return res;
    }
}