""" 
Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies

First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.

Return an array of integers containing the frequency of each learner in B as found in array A.

Example Input
Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]


Example Output
Output 1:
[3, 1]
Output 2:
[0, 2]
"""

class Solution:
    # @param A : list of integers
    # @param B : list of integers
    # @return a list of integers
    def solve(self, A, B):
        my_dict = {}
        my_list = []

        for i in range(len(A)):
            if(A[i] in my_dict):
                freq = my_dict[A[i]]
                my_dict[A[i]] = freq + 1
            else:
                my_dict[A[i]] = 1

        for j in range(len(B)):
            if B[j] in my_dict:
                my_list.append(my_dict[B[j]])
            else:
                my_list.append(0)
        return my_list