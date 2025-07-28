""" 
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.

Input Format : First argument A is an array of integers.
Output Format : Return an integer.

Example Input
Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output
Output 1:
1
Output 2:
2
"""
# Solved two types with counter and without counters

# ============================= without counter ===================================
# class Solution:
#     # @param A : list of integers
#     # @return an integer
#     def solve(self, A):
#         my_dict = {}
#         count = 0

#         for i in A:
#             if i in my_dict:
#                 freq = my_dict[i] 
#                 my_dict[i] = freq + 1
#             else:
#                 my_dict[i] = 1
            

#         for i in my_dict:
#             if my_dict[i] == 1:
#                 count = count + 1

#         return count

# ============================= with counter ===================================
from collections import Counter

class Solution:
    def solve(self, A):
        my_dict = Counter(A)
        count = 0

        for value in my_dict.values():
            if value == 1:
                count = count + 1

        return count
