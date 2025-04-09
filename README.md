# Data Structure Algorithms :- 

### 01 Prefix Sum Algorithm

The prefix sum algorithm is a powerful technique for efficiently computing cumulative sums of elements in an array. It enables quick calculations of the sum of any subarray after an initial preprocessing step.

#### 1. Create a Prefix Sum Array

Given an array `arr` of size `n`, create a new array `prefix_sum` of size `n + 1`:

- `prefix_sum[0] = 0`
- For each index `i` from 1 to `n`, compute:
  \[
  \text{prefix\_sum}[i] = \text{prefix\_sum}[i - 1] + \text{arr}[i - 1]
  \]
  
This means `prefix_sum[i]` contains the sum of the elements from the start of the array up to, but not including, index `i`.

#### 2. Querying the Sum of a Subarray

To find the sum of a subarray from index `l` to `r` (inclusive):
\[
\text{sum}(l, r) = \text{prefix\_sum}[r + 1] - \text{prefix\_sum}[l]
\]
This operation takes constant time, \(O(1)\), after preprocessing.

#### Complexity

- Preprocessing Time: \(O(n)\)
- Query Time: \(O(1)\)
- Space Complexity: \(O(n)\)

#### Applications

- Fast range sum queries
- Cumulative frequency calculations
- Optimizing dynamic programming problems

### 02 Carry Forward Technique

The "carry forward" technique is commonly used in algorithm design and data structures to efficiently manage and update data over time. This approach is especially useful in scenarios where you need to maintain running totals or aggregates while minimizing the need for full recalculations. Below, we’ll explore the technique, its implementation, complexity, and applications.

#### Complexity 
 - Initialization Time: 𝑂(𝑛)
 - Update Time: 𝑂(𝑛)
 - Query Time: 𝑂(1)
   
#### Applications
 - Dynamic Range Queries: Useful for applications that require frequent updates and range sum queries.
 - Data Analysis: Keeping track of cumulative values while processing streams of data.
 - Game Development: Efficiently updating and querying scores or resources.

### 03 Subarray

A subarray is a portion of an array that consists of consecutive elements from the original array.
In general, for an array of size n, there are n*(n+1)/2 non-empty subarrays.

#### Characteristics of a Subarray:
 - Contiguity: The elements in a subarray are contiguous, meaning they are consecutive and in order in the original array.
 - Length: The length of a subarray can be any positive integer, from 1 to the length of the original array.
 - Element Selection: The elements in a subarray are selected from the original array.

### 2D Array
