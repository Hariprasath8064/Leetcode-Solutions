// Last updated: 9/17/2025, 11:08:03 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int a = stack.pop();
                int second = a + stack.peek();
                stack.push(a);
                stack.push(second);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(2 * stack.peek());
            }
            else{
                stack.push(Integer.parseInt(s));
            } 
            
        }
        int total = 0;
        while(!stack.isEmpty()){
            total += stack.pop();
        }
        return total;
    }
}