class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> count= new HashMap<>();

        for(int[] r : grid){
            for(int num : r){
                count.put(num, count.getOrDefault(num,0) + 1);

            }
        }
        int repeated = 0;
        for(int key : count.keySet()){
            if(count.get(key) == 2){
                repeated = key;
                break;
            }
        }

        int sum = (n * n*(n*n + 1))/2;
        int a = 0;
        for(int key : count.keySet()){
            a += key * count.get(key);
        }

        int missing = sum - (a - repeated);

        return new int[]{repeated, missing};

        
    }
}