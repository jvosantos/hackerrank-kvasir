# Circular Array Rotation #

John Watson performs an operation called a right circular rotation on an array of 
integers, `[a_0, a_1, ..., a_n-1]`. After performing one right circular rotation 
operation, the array is transformed from `[a_0, a_1, ..., a_n-1]` to 
`[a_n-1, a_0, ..., a_n-2]`.

Watson performs this operation _k_ times. To test Sherlock's ability to identify the 
current element at a particular position in the rotated array, Watson asks _q_ queries, 
where each query consists of a single integer, _m_, for which you must print the element 
at index _m_ in the rotated array (i.e., the value of `a_m`).

## Input Format ##

The first line contains 3 space-separated integers, _n_, _k_, and _q_, respectively. 
The second line contains _n_ space-separated integers, where each integer _i_ describes 
array element `a_i` (where 0 <= i < n). 
Each of the _q_ subsequent lines contains a single integer denoting _m_.

## Constraints ##

 * 1 <= n <= 10^5
 * 1 <= a_i <= 10^5
 * 1 <= k <= 10^5
 * 1 <= q <= 500
 * 0 <= m <= N - 1
 
## Output Format ##

For each query, print the value of the element at index _m_ of the rotated array on a new 
line.

## Sample Input ##

> 3 2 3
> 1 2 3
> 0
> 1
> 2

## Sample Output ##

> 2
> 3
> 1

## Explanation ##

After the first rotation, the array becomes `[3, 1, 2]`. 

After the second (and final) rotation, the array becomes `[2, 3, 1]`.

Let's refer to the array's final state as array _b_. For each query, we just have to 
print the value of `b_m` on a new line:

 1. _m_ = 0, so we print 2 on a new line.
 2. _m_ = 1, so we print 3 on a new line.
 2. _m_ = 2, so we print 1 on a new line.
