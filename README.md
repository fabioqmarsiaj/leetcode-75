# LeetCode 75 in Java

A Java 17 practice workspace for the official [LeetCode 75 study plan](https://leetcode.com/studyplan/leetcode-75/).

This repository intentionally contains no solutions. Each challenge has a LeetCode-compatible class whose methods throw `UnsupportedOperationException("TODO")`, plus active JUnit 5 tests based on the official examples and meaningful edge cases. Implement one challenge at a time and turn its tests green.

## Requirements

- JDK 17 or newer
- No local Gradle installation is required; the Gradle Wrapper is included

## Running Tests

Compile every source and test without running the intentionally failing suite:

```powershell
.\gradlew.bat compileTestJava
```

Run all tests:

```powershell
.\gradlew.bat test
```

Run one challenge on Windows:

```powershell
.\gradlew.bat test --tests "leetcode75.arraystring.p1768_mergestringsalternately.SolutionTest"
```

On macOS or Linux, replace `.\gradlew.bat` with `./gradlew`.

Tests are active from the start. A test fails with `UnsupportedOperationException: TODO` until its corresponding implementation is completed.

## Project Conventions

- Production code lives in `src/main/java/leetcode75/<category>/<problem>/`.
- Tests mirror that layout in `src/test/java/leetcode75/<category>/<problem>/`.
- Problem packages use `p<number>_<slug>`, for example `p1768_mergestringsalternately`.
- Most challenges expose the official `Solution` class and method signature.
- Design challenges use their official names: `RecentCounter`, `SmallestInfiniteSet`, `Trie`, and `StockSpanner`.
- Linked-list and tree packages contain local `ListNode` or `TreeNode` definitions so challenges stay independent.
- Problem 374 includes a local `GuessGame` oracle used by its tests.
- Unordered answers, floating-point results, and in-place mutations are compared appropriately by their tests.

To submit an implementation on LeetCode, copy the relevant class body. LeetCode supplies types such as `ListNode`, `TreeNode`, and `GuessGame`, so their local definitions are only for this workspace.

## Challenge Checklist

### Array / String

- [x] 1768 - [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)
- [x] 1071 - [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)
- [x] 1431 - [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
- [ ] 605 - [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)
- [ ] 345 - [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)
- [ ] 151 - [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
- [ ] 238 - [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
- [ ] 334 - [Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/)
- [ ] 443 - [String Compression](https://leetcode.com/problems/string-compression/)

### Two Pointers

- [ ] 283 - [Move Zeroes](https://leetcode.com/problems/move-zeroes/)
- [ ] 392 - [Is Subsequence](https://leetcode.com/problems/is-subsequence/)
- [ ] 11 - [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
- [ ] 1679 - [Max Number of K-Sum Pairs](https://leetcode.com/problems/max-number-of-k-sum-pairs/)

### Sliding Window

- [ ] 643 - [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/)
- [ ] 1456 - [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)
- [ ] 1004 - [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/)
- [ ] 1493 - [Longest Subarray of 1's After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)

### Prefix Sum

- [ ] 1732 - [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
- [ ] 724 - [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)

### Hash Map / Set

- [ ] 2215 - [Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/)
- [ ] 1207 - [Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/)
- [ ] 1657 - [Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/)
- [ ] 2352 - [Equal Row and Column Pairs](https://leetcode.com/problems/equal-row-and-column-pairs/)

### Stack

- [ ] 2390 - [Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/)
- [ ] 735 - [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/)
- [ ] 394 - [Decode String](https://leetcode.com/problems/decode-string/)

### Queue

- [ ] 933 - [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)
- [ ] 649 - [Dota2 Senate](https://leetcode.com/problems/dota2-senate/)

### Linked List

- [ ] 2095 - [Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)
- [ ] 328 - [Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/)
- [ ] 206 - [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- [ ] 2130 - [Maximum Twin Sum of a Linked List](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/)

### Binary Tree - DFS

- [ ] 104 - [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
- [ ] 872 - [Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/)
- [ ] 1448 - [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)
- [ ] 437 - [Path Sum III](https://leetcode.com/problems/path-sum-iii/)
- [ ] 1372 - [Longest ZigZag Path in a Binary Tree](https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/)
- [ ] 236 - [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

### Binary Tree - BFS

- [ ] 199 - [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)
- [ ] 1161 - [Maximum Level Sum of a Binary Tree](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/)

### Binary Search Tree

- [ ] 700 - [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)
- [ ] 450 - [Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)

### Graphs - DFS

- [ ] 841 - [Keys and Rooms](https://leetcode.com/problems/keys-and-rooms/)
- [ ] 547 - [Number of Provinces](https://leetcode.com/problems/number-of-provinces/)
- [ ] 1466 - [Reorder Routes to Make All Paths Lead to the City Zero](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/)
- [ ] 399 - [Evaluate Division](https://leetcode.com/problems/evaluate-division/)

### Graphs - BFS

- [ ] 1926 - [Nearest Exit from Entrance in Maze](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/)
- [ ] 994 - [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)

### Heap / Priority Queue

- [ ] 215 - [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- [ ] 2336 - [Smallest Number in Infinite Set](https://leetcode.com/problems/smallest-number-in-infinite-set/)
- [ ] 2542 - [Maximum Subsequence Score](https://leetcode.com/problems/maximum-subsequence-score/)
- [ ] 2462 - [Total Cost to Hire K Workers](https://leetcode.com/problems/total-cost-to-hire-k-workers/)

### Binary Search

- [ ] 374 - [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)
- [ ] 2300 - [Successful Pairs of Spells and Potions](https://leetcode.com/problems/successful-pairs-of-spells-and-potions/)
- [ ] 162 - [Find Peak Element](https://leetcode.com/problems/find-peak-element/)
- [ ] 875 - [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)

### Backtracking

- [ ] 17 - [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
- [ ] 216 - [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/)

### Dynamic Programming - 1D

- [ ] 1137 - [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)
- [ ] 746 - [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)
- [ ] 198 - [House Robber](https://leetcode.com/problems/house-robber/)
- [ ] 790 - [Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling/)

### Dynamic Programming - Multidimensional

- [ ] 62 - [Unique Paths](https://leetcode.com/problems/unique-paths/)
- [ ] 1143 - [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
- [ ] 714 - [Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)
- [ ] 72 - [Edit Distance](https://leetcode.com/problems/edit-distance/)

### Bit Manipulation

- [ ] 338 - [Counting Bits](https://leetcode.com/problems/counting-bits/)
- [ ] 136 - [Single Number](https://leetcode.com/problems/single-number/)
- [ ] 1318 - [Minimum Flips to Make a OR b Equal to c](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)

### Trie

- [ ] 208 - [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)
- [ ] 1268 - [Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)

### Intervals

- [ ] 435 - [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)
- [ ] 452 - [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)

### Monotonic Stack

- [ ] 739 - [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
- [ ] 901 - [Online Stock Span](https://leetcode.com/problems/online-stock-span/)
