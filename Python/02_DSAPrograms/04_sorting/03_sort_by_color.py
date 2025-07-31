"""   
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.

Input Format : First and only argument of input contains an integer array A.
Output Format : Return an integer array in asked order

Example Input
Input 1 : A = [0, 1, 2, 0, 1, 2]
Input 2: A = [0]


Example Output
Output 1: [0, 0, 1, 1, 2, 2]
Output 2: [0]

"""

class Solution:
    # @param A : list of integers
    # @return a list of integers
    def sortColors(self, A):
        max_val = max(A)
        count = [0] * (max_val+1)

        for num in A:
            count[num] += 1

        sorted_arr = []

        for num in range(len(count)):
            sorted_arr.extend([num] * count[num])
        return sorted_arr