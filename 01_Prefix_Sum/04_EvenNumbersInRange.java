/*
Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 109
0 <= B[i][0] <= B[i][1] < N

Input Format
First argument A is an array of integers.
Second argument B is a 2D array of integers.

Output Format
Return an array of integers.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [   [0, 2] 
        [2, 4]
        [1, 4]   ]
Input 2:
A = [2, 1, 8, 3, 9, 6]
B = [   [0, 3]
        [3, 5]
        [1, 3] 
        [2, 4]   ]

Example Output
Output 1:
[1, 1, 2]
Output 2:
[2, 1, 1, 1]
*/

public class Solution {

    static int[] getPreCountArray(int[] A){
        int arrayCount = A.length;
        int[] preCountArray = new int[arrayCount];

        preCountArray[0] = (A[0]%2 == 0) ? 1 : 0;

        for(int i=1; i<arrayCount; i++){
            preCountArray[i] = (A[i]%2 == 0) ? (preCountArray[i-1] + 1) : preCountArray[i-1];
        }
        return preCountArray;
    }

    public int[] solve(int[] A, int[][] B) {
        int arrayCount = A.length;
        int queryCount = B.length;
        int[] result = new int[queryCount];
        int[] preCountArray = getPreCountArray(A);

        for(int i=0; i<queryCount; i++){
            int left = B[i][0];
            int right = B[i][1];

            if(left == 0){
                result[i] = preCountArray[right];
            }else{
                result[i] = preCountArray[right] - preCountArray[left-1];
            }
        }
        return result;
    }
}