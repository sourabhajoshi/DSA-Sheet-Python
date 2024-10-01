# Data Structure Algorithms

### Prefix Sum Algorithm
#### The prefix sum algorithm is a powerful technique for efficiently computing cumulative sums of elements in an array. It enables quick calculations of the sum of any subarray after an initial preprocessing step.

#### How It Works
#### Create a Prefix Sum Array: Given an array arr of size n, create a new array prefix_sum of size n + 1:

#### prefix_sum[0] = 0
#### For each index i from 1 to n, compute:
#### prefix_sum[𝑖]=prefix_sum[𝑖−1]+arr[𝑖−1]
#### prefix_sum[i]=prefix_sum[i−1]+arr[i−1]
#### This means prefix_sum[i] contains the sum of the elements from the start of the array up to, but not including, index i.

#### Querying the Sum of a Subarray: To find the sum of a subarray from index l to r (inclusive):

#### sum(𝑙,𝑟)= prefix_sum[𝑟+1]−prefix_sum[𝑙]
#### sum(l,r)=prefix_sum[r+1]−prefix_sum[l]
#### This operation takes constant time, 𝑂(1) after preprocessing.

#### Example
#### Consider the array:

#### plaintext
#### Copy code
#### arr = [2, 4, 1, 3, 5]
#### Compute the Prefix Sum Array:

#### prefix_sum[0] = 0
#### prefix_sum[1] = 2
#### prefix_sum[2] = 6
#### prefix_sum[3] = 7
#### prefix_sum[4] = 10
#### prefix_sum[5] = 15
#### Resulting in: prefix_sum = [0, 2, 6, 7, 10, 15].

#### Querying the Sum: To find the sum from index 1 to 3 (i.e., 4 + 1 + 3):

#### sum(1,3)=prefix_sum[4]−prefix_sum[1]=10−2=8
#### Complexity
#### Preprocessing Time: 𝑂(𝑛)
#### Query Time: 𝑂(1)
#### Space Complexity: 𝑂(𝑛)

#### Applications
#### Fast range sum queries
#### Cumulative frequency calculations
#### Optimizing dynamic programming problems
