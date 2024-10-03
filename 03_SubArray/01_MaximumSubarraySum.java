/*
Problem Description
Given an array A of length N, Find the maximum subarray sum out of all possible non-empty subarray.

Problem Constraints
1 <= N <= 103
-105 <= A[i] <= 105

Input Format
Only argument A is an array of integers.

Output Format
Return a single integer i.e. max subarray sum

Example Input
Input 1:
A = [41, 36, -13, 14, -25]
Input 2:
A = [-2, 2, 34, -1, 16, 23, 12, 41, -7, -32]

Example Output
Output 1:
78
Output 2:
127
*/

public class Solution {
    public long solve(int[] A) {
        int arrayLength = A.length;
        int sum = A[0];
        int max = A[0];

        for(int i=1; i<arrayLength; i++){
            if(sum < 0){
                sum = 0;
            }
            sum = sum + A[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}