// Last updated: 9/17/2025, 11:24:24 PM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String s : logs){
            if(s.equals("../")){
                if(stack.isEmpty()){
                    continue;
                }
                else{
                    stack.pop();
                }
            }
            else if(s.equals("./")){
                continue;
            }
            else{
                stack.push("s");
            }
        }
        return stack.size();
    }
}