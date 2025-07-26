/*
Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.

Problem Constraints
1 <= N <= 5 x 103
1 <= A[i] <= 1000
1 <= B <= 107

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return an integer denoting the number of subarrays in A having sum less than B.

Example Input
Input 1:
 A = [2, 5, 6]
 B = 10
Input 2:
 A = [1, 11, 2, 3, 15]
 B = 10

Example Output
Output 1:
 4
Output 2:
 4
*/

public class Solution {

    static int[] getPrefixSum(int[] A){
        int arrayCount = A.length;
        int[] preSumArray = new int[arrayCount];
        preSumArray[0] = A[0];

        for(int i=1; i<arrayCount; i++){
            preSumArray[i] = preSumArray[i-1] + A[i];
        }
        return preSumArray;
    }

    public int solve(int[] A, int B) {
        int arrayCount = A.length;
        int[] preSumArray = getPrefixSum(A);
        int count = 0;

        for(int i=0; i<arrayCount; i++){
            for(int j=i; j<arrayCount; j++){
                int sum = 0;
                if(i == 0){
                    sum = preSumArray[j];
                }else{
                    sum = preSumArray[j] - preSumArray[i-1];
                }
                if(sum < B){
                    count++;
                }
            }
        }
        return count;
    }
}

