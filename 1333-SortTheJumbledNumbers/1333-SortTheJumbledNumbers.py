# Last updated: 6/15/2025, 5:28:40 PM
class Solution:
    def sortJumbled(self, mapping, nums):
        def get_mapped_value(num):
            num_str = str(num)
            mapped_str = ''.join(str(mapping[int(digit)]) for digit in num_str)
            return int(mapped_str)

        # Create a list of tuples (original index, original number, mapped value)
        mapped_nums = [(i, num, get_mapped_value(num)) for i, num in enumerate(nums)]

        # Sort based on the mapped values while keeping the original indices to maintain stability
        mapped_nums.sort(key=lambda x: x[2])

        # Extract the sorted numbers based on the original order of input nums
        sorted_nums = [num[1] for num in mapped_nums]

        return sorted_nums

# Example usage
mapping = [8, 9, 4, 0, 2, 1, 3, 5, 7, 6]
nums = [991, 338, 38]
sol = Solution()
print(sol.sortJumbled(mapping, nums))  # Output: [338, 38, 991]

mapping = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
nums = [789, 456, 123]
print(sol.sortJumbled(mapping, nums))  # Output: [123, 456, 789]
