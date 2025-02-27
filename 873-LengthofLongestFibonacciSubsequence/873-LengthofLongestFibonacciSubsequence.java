class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i], b = arr[j];
                int length = 2;
                
                while (true) {
                    int next = a + b;
                    int idx = Arrays.binarySearch(arr, j + 1, n, next); 
                    
                    if (idx > 0) {
                        a = b;
                        b = arr[idx];
                        length++;
                    } else {
                        break; 
                    }
                }
                
                maxLen = Math.max(maxLen, length);
            }
        }
        
        return maxLen > 2 ? maxLen : 0;
        
    }
}