// Last updated: 9/15/2025, 9:15:59 PM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map = new HashMap<>();
        for(List<String> resp : responses){
            Set<String> set = new HashSet<>(resp);
            for(String response : set){
                map.put(response,map.getOrDefault(response,0) + 1);
            }
        }
        String result = "";
        int max = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String resp = entry.getKey();
            int count = entry.getValue();
            if(count > max || count == max && resp.compareTo(result) < 0){
                max = count;
                result = resp;
            }
        }
        return result;
    }
}