""" 
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
Input Format : The first argument is an integer array A.
Output Format : Return an integer array that is the sorted array A.

Example Input
Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]


Example Output
Output 1:
[1, 1, 3]
Output 2:
[1, 2, 3, 4]
"""

class Solution:
    # @param A : list of integers
    # @return a list of integers
    def solve(self, A):

        max_val = max(A)
        count = [0] * (max_val+1)

        for num in A:
            count[num] += 1

        sorted_arr = []

        for num in range(len(count)):
            sorted_arr.extend([num] * count[num])
        return sorted_arr