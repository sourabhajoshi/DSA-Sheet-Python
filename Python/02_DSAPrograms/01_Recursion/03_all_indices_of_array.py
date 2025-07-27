""" 
Given an array of integers A with N elements and a target integer B, the task is to find all the indices at which B occurs in the array.

Note: The problem encourages recursive logic for learning purposes. Although the online judge doesn't enforce recursion, it's recommended to use recursive solutions to align with the question's spirit.

Example Input

Input 1:
A = [1, 2, 3, 4, 5]
B = 1
Input 2:
A = [8, 9, 5, 6, 5, 5]
B = 5


Example Output
Output 1:
[0]
Output 2:
[2, 4, 5]

"""

class Solution:
    
    def all_indices(self, A, B, ind, indices_list):
        if ind == len(A):
            return indices_list  

        if A[ind] == B:
            indices_list.append(ind)
        return self.all_indices(A, B, ind+1, indices_list)
    
    # @param A : list of integers
    # @param B : integer
    # @return a list of integers
    def allIndices(self, A, B):
        return self.all_indices(A, B, 0, [])