
                                                  # DSA : BASIC-SORTING
# Selection Sort :
- Selection Sort is a simple sorting algorithm that divides the input array into two parts: a sorted region and an unsorted region.
- The algorithm repeatedly selects the minimum (or maximum, depending on the sorting order) element from the unsorted region and swaps it with the first element of the unsorted region.
- This process is repeated until the entire array is sorted.
- Selection Sort is an in-place sorting algorithm, meaning it doesn't require additional memory proportional to the input size.

## Algorithm:

1. Initialization:
- The array is divided into two regions: the left region (sorted) and the right region (unsorted).
- Initially, the left region is empty, and the right region contains all elements of the array.

2. Selection of the Minimum Element:
- Find the minimum element in the unsorted region.

3. Swapping:
- Swap the minimum element with the first element of the unsorted region.
- This effectively adds the minimum element to the sorted region.

4. Shifting the Boundary:
- Move the boundary between the sorted and unsorted regions one element to the right, making the sorted region bigger and the unsorted region smaller.

5. Repeat:
- Repeat steps 2-4 until the entire array is sorted.


## Time Complexity:
  1. Worst Case:- O(n^2) 
  2. Average Case:- O(n^2) 
  3. Best Case:- O(n^2) 

## Space Complexity:
  Space Complexity:- O(1) 

## Stability:
  - Stability: Not stable.
  - The relative order of equal elements may not be preserved during sorting.

## Advantages:
  - Simplicity: Very easy to understand and implement.
  - In-Place Sorting: Requires only a constant amount of additional memory.

## Disadvantages:
  - Inefficiency: Inefficient for large datasets due to its quadratic time complexity.
  - Not Adaptive: The time complexity remains the same regardless of the initial order of the elements.
