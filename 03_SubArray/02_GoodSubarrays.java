/*
Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

Problem Constraints
1 <= len(A) <= 5 x 103
1 <= A[i] <= 103
1 <= B <= 107

Input Format
The first argument given is the integer array A.
The second argument given is an integer B.

Output Format
Return the count of good subarrays in A.

Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = 4
Input 2:
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65

Example Output
Output 1:
6
Output 2:
36
*/

public class Solution {

    static int[] getPrefixSum(int[] A){
        int N = A.length;
        int[] preSumArray = new int[N];
        preSumArray[0] = A[0];

        for(int i=1; i<N; i++){
            preSumArray[i] = preSumArray[i-1] + A[i];
        }
        return preSumArray;
    }

    public int solve(int[] A, int B) {
        int N = A.length;
        int[] preSumArray = getPrefixSum(A);
        int count = 0;

        for(int start=0; start<N; start++){
            int length = 0;
            int sum = 0;
            for(int end = start; end<N; end++){
                length = end - start + 1;
                if(start == 0){
                    sum = preSumArray[end];
                }else{
                    sum = preSumArray[end] - preSumArray[start-1];
                }
                if((length%2 == 0) && (sum < B)){
                    count++;
                }else if((length%2 != 0) && (sum > B)){
                    count++;
                }
            }
        }
        return count;
    }
}
