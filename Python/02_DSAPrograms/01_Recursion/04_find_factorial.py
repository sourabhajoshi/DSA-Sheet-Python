""" 
Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.

Input Format: First and only argument is an integer A.
Output Format: Return an integer denoting the factorial of the number A.

Example Input
Input 1:
 A = 4
Input 2:
 A = 1

Example Output
Output 1:
 24
Output 2:
 1
"""

class Solution:
    # @param A : integer
    # @return an integer
    def solve(self, A):
        if A == 0:
            return 1
        return self.solve(A-1) * A