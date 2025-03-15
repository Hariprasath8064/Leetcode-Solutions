class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (digits[i] != 0 && digits[k] % 2 == 0) {
                            result.add(num);
                        }
                    }
                }
            }
        }
        
        return result.size();
    }
}