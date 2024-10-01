# Data Structure Algorithms

### Prefix Sum Algorithm

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

- **Preprocessing Time**: \(O(n)\)
- **Query Time**: \(O(1)\)
- **Space Complexity**: \(O(n)\)

#### Applications

- **Fast range sum queries**
- **Cumulative frequency calculations**
- **Optimizing dynamic programming problems**
