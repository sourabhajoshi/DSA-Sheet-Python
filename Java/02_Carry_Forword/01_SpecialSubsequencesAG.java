/*
Problem Description
You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

Problem Constraints
1 <= length(A) <= 105

Input Format
First and only argument is a string A.

Output Format
Return an long integer denoting the answer.

Example Input
Input 1:
 A = "ABCGAG"
Input 2:
 A = "GAB"
Example Output
Output 1:
 3
Output 2:
 0
*/

public class Solution {
    public long solve(String A) {
        int stringLength = A.length();
        long count = 0;
        long countPair = 0;

        for(int i=stringLength-1; i>=0; i--){
            if(A.charAt(i) == 'G'){
                count++;
            }else if(A.charAt(i) == 'A'){
                countPair = countPair + count;
            }
        }
        return countPair;
    }
}