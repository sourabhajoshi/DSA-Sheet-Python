/*
Problem Description
Given an integer matrix A of size NxN. Print the matrix in spiral form starting from A[0][0] in the first row.
For example : Given matrix of 2x2
1 2
3 4
You should print => 1 2 4 3

Problem Constraints
1 <= N <= 1000
1 <= A[i] <= 109

Input Format
First line is N
Next N line contains N integers in each line

Output Format
Print matrix in spiral form in a single line

Example Input
Input 1:
2
5 2
6 8 
Input 2:
3
8 2 5 
2 9 6 
5 8 7

Example Output
Output 1:
5 2 8 6 
Output 2:
8 2 5 6 7 8 5 2 9
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N;
        int total = N*M;

        int[][] matrix = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //define variables
            int rowStart = 0;
            int rowEnd = N-1;
            int columnStart = 0;
            int columnEnd = M-1;

        while(total > 0){
            //Top wall : Row is fixed and Column is varied
            for(int c=columnStart; c<=columnEnd; c++){
                System.out.print(matrix[rowStart][c] + " ");
                total--;
            }
            rowStart++;

            //Right wall : Column is fixed and Row is varied
            for(int r=rowStart; r<=rowEnd; r++){
                System.out.print(matrix[r][columnEnd] + " ");
                total--;
            }
            columnEnd--;

            //Bottom wall : Row is fixed and Column is varied
            for(int c=columnEnd; c>=columnStart; c--){
                System.out.print(matrix[rowEnd][c] + " ");
                total--;
            }
            rowEnd--;

            //Left wall : Column is fixed and Row is varied
            for(int r=rowEnd; r>=rowStart; r--){
                System.out.print(matrix[r][columnStart] + " ");
                total--;
            }
            columnStart++;
        }
    }
}