// Last updated: 6/15/2025, 5:28:14 PM
class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(ch == '*'){
                if(stack.length() > 0){
                    stack.deleteCharAt(stack.length() - 1);
                }

            }
            else{
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}