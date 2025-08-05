// Last updated: 8/6/2025, 12:25:00 AM
class Solution {
    private void combo(int index, int[] array, int target, List<List<Integer>> ans , List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
        }

        for(int i = index; i < array.length;i++){
            if(i > index && array[i] == array[i - 1]){
                continue;
            }
            if(array[i] > target){
                break;
            }
            temp.add(array[i]);
            combo(i + 1,array,target - array[i],ans,temp);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        combo(0,candidates,target,ans,temp);
        return ans;

    }
}