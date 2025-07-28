""" 
Given an array A of N integers, return the number of unique elements in the array.
Input Format : First argument A is an array of integers.
Output Format : Return an integer.

Example Input
Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output
Output 1:
3
Output 2:
4
"""

class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        my_sets = set()
        for i in A:
            my_sets.add(i)

        return len(my_sets)