// Last updated: 9/16/2025, 11:43:52 PM
class Solution {
    public String reverseStr(String st, int k) {
        char[] arr = st.toCharArray();
        int n = st.length();
        for(int s = 0 ;s< n;s += 2*k){
            int i = s;
            int j = Math.min(s+k-1,n - 1);
            while(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}