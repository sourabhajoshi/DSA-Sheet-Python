/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.


Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]

Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]

Example Output
Output 1:
[10, 5]

Output 2:
[2, 4]
*/

public class Solution {

    //calculate prefix sum
    static long[] getPrefixSumArray(int[] A){
        int arrayCount = A.length;
        long[] preSumArray = new long[arrayCount];
        preSumArray[0] = A[0];

        for(int i=1; i<arrayCount; i++){
            preSumArray[i] = preSumArray[i-1] + A[i];
        }
        return preSumArray;
    }

    public long[] rangeSum(int[] A, int[][] B) {
        int arrayCount = A.length;
        int queryCount = B.length;
        long[] result = new long[queryCount];
        long[] preSumArr = getPrefixSumArray(A); 

        for(int i=0; i<queryCount; i++){
            int left = B[i][0];
            int right = B[i][1];

            if(left != 0){
                result[i] = preSumArr[right] - preSumArr[left-1];
            }else{
                result[i] = preSumArr[right];
            }
        }
        return result;
    }
}