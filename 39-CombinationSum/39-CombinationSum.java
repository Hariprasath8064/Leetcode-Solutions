// Last updated: 8/4/2025, 10:04:46 PM
class Solution {
    private void combo(int index, int[] array,int target, List<List<Integer>> ans,List<Integer> temp){
        if(index == array.length){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(array[index] <= target){
            temp.add(array[index]);
            combo(index,array,target - array[index],ans,temp);
            temp.remove(temp.size() - 1);
        }
        combo(index + 1,array,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combo(0,candidates,target,result,temp);
        return result;
    } 
}