# Last updated: 6/15/2025, 5:28:31 PM
class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        
        d = {}
        for num in nums:
            if num in d:
                d[num] += 1
            else:
                d[num] = 1

        
        L = []
        for key, value in d.items():
            L.append((key, value))

        
        for i in range(len(L)):
            for j in range(i + 1, len(L)):
                
                if L[i][1] > L[j][1]:
                    L[i], L[j] = L[j], L[i]
        
                elif L[i][1] == L[j][1] and L[i][0] < L[j][0]:
                    L[i], L[j] = L[j], L[i]

        
        result = []
        for num, freq in L:
            result.extend([num] * freq)
        
        return result
