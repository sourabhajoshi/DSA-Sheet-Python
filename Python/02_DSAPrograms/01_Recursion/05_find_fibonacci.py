""" 
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
Fn = Fn-1 + Fn-2
Given a number A, find and return the Ath Fibonacci Number using recursion.
Given that F0 = 0 and F1 = 1.

Input Format : First and only argument is an integer A.

Output Format : Return an integer denoting the Ath term of the sequence. 

Example Input
Input 1:
 A = 2
Input 2:
 A = 9

Example Output
Output 1:
 1
Output 2:
 34
"""

class Solution:
    # @param A : integer
    # @return an integer
    def findAthFibonacci(self, A):
        if A == 0:
            return 0

        if A == 1:
            return 1

        return self.findAthFibonacci(A-1) + self.findAthFibonacci(A-2)