// Last updated: 9/14/2025, 7:35:19 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(char c: text.toCharArray()){
            if(c == 'b'|| c == 'a'|| c == 'l'||c == 'o'||c == 'n'){
                map.put(c,map.getOrDefault(c,0) + 1);
            }
        }
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; 
        int o = map.getOrDefault('o', 0) / 2; 
        int n = map.getOrDefault('n', 0);
        
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}