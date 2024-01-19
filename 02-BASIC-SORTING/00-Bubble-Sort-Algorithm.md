                                      #   DSA : BASIC-SORTING

# BUBBLE SORT :
- Also called as Shrinking Sort or Exchange Sort
- An Inplace, Comparison based sorting algorithm

## Intuition :
  Bubble Sort states that to sort any array
  - perform a certain no.of iterations or passes and
    In every iteration check whether the adjacent elements are in the correct position,
    If they are not in the correct position then we swap the adjacent elements.

    i) Increasing order / Ascending Order
        if (arr[j+1] > arr[i]) then
            swap arr[i+1] with arr[i]

    ii) Decreasing order / Descending Order
        if (arr[j+1] < arr[i]) then
            swap arr[i+1] with arr[i]

    Example : [7,12,3,9,30]

    for Increasing Order : [3,7,9,12,30]
    Similarly,
    for Decreasing order : [30,12,9,7,3]

## DryRun
    Let's dry-run in case of increasing the order
    Given array = [12,9,2,7,8,1]
    length of array = N = 6
        iteration:1 =>  [9,2,7,8,1,12]
        iteration:2 =>  [2,7,8,1,9,12]
        iteration:3 =>  [2,7,1,8,9,12]
        iteration:4 =>  [2,1,7,8,9,12]
        iteration:5 =>  [1,2,7,8,9,12]

    finally,
    - the increasingly sorted array => [1,2,7,8,9,12]

    Observations:
    - if the array size is 'N', then we took 'N-1' iterations
    - It is to be observed the in case of sorting increasingly,
        in every iteration/pass we tried to push the largest element to the end of the array.

## Complexity Analysis:
        - Time Complexity :

            No.of Iteration/passes in outer(i) loop = n-1
            No.of Iterations in inner(j) loop = n-1
            Total Time Complexity = O(n*n) => O(n^2)

            Best Case = if the given array is already sorted array => (n)

            Average and Worst Case = O(N^2)
            (n-1) + (n-2) + (n-3) + (n-4).............n-(n-1)
            n(n-1) -(1+2+3+........+(n-1)) => sum of n terms => n(n+1)/2 => O(n^2)

        - Space Complexity: No extra array is used  => O(1)
            - Hence, Bubble sort is an In-Place sorting algorithm
            
## stable and unstable sort
        array : 5,4,3,2,3* where * represents duplication of values
        stable : 2,3,3*,4,5
        unstable: 2,3*,3,4,5

    In Bubble sort, as we are checking for 'strict greater-than' of elements in the array,
    so there will be no change of instability in the sorting process
