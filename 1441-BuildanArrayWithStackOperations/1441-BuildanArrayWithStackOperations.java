// Last updated: 12/11/2025, 3:08:26 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (String token : tokens) {
6            if (!token.equals("+") && !token.equals("-") && 
7                !token.equals("*") && !token.equals("/")) {
8                
9                stack.push(Integer.parseInt(token));
10            } 
11            else { 
12                int b = stack.pop();
13                int a = stack.pop();
14
15                switch (token) {
16                    case "+":
17                        stack.push(a + b);
18                        break;
19                    case "-":
20                        stack.push(a - b);
21                        break;
22                    case "*":
23                        stack.push(a * b);
24                        break;
25                    case "/":
26                        stack.push(a / b);
27                        break;
28                }
29            }
30        }
31
32        return stack.pop();
33    }
34}
35