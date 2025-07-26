/*
Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105

Input Format
First arugment is an array A .

Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]

Input 2:
A = [1, 2, 3]

Example Output
Output 1:
3

Output 2:
-1
*/

public class Solution {

    static int[] getPrefixSumArray(int[] A){
        int arrayCount = A.length;
        int[] preSumArray = new int[arrayCount];
        preSumArray[0] = A[0];

        for(int i=1; i<arrayCount; i++){
            preSumArray[i] = preSumArray[i-1] + A[i];
        }
        return preSumArray;
    }

    public int solve(int[] A) {
        int arrayCount = A.length;
        int[] preSumArray = getPrefixSumArray(A);

        int[] leftSum = new int[arrayCount];
        int[] rightSum = new int[arrayCount];

        for(int i=0; i<arrayCount; i++){
            if(i == 0){
                leftSum[i] = 0; 
            }else{
                leftSum[i] = preSumArray[i-1];
            }
            rightSum[i] = preSumArray[arrayCount-1] - preSumArray[i];

            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}