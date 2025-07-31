"""
An integer is given to you in the form of an array, with each element being a separate digit.

Find the smallest number (leading zeroes are allowed) that can be formed by rearranging the digits of the given number in an array. Return the smallest number in the form an array.

Note - Do not use any sorting algorithm or library's sort method.

Input Format
First argument A is an array of length N, representing digits of the number.

Output Format Rturn the array representing the smallest possible number in form of an array.

Example Input
Input 1:
A = [6, 3, 4, 2, 7, 2, 1]
Input 2:
A = [4, 2, 7, 3, 9, 0]

Example Output
Output 1:
[1, 2, 2, 3, 4, 6, 7]
Output 2:
[0, 2, 3, 4, 7, 9]
"""

class Solution:
    # @param A : list of integers
    # @return a list of integers
    def smallestNumber(self, A):
        max_val = max(A)

        count = [0] * (max_val + 1)

        for num in A:
            count[num] += 1

        sorted_arr = []

        for num in range(len(count)):
            sorted_arr.extend([num] * count[num])
            
        
        return sorted_arr
