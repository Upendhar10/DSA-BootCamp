                                    # DSA : BASIC-SORTING

# Insertion Sort :
- Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time.
- Insertion Sort is an in-place sorting algorithm.
- It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
- However, it has some advantages, such as its simplicity and low overhead, which make it useful for small datasets or partially sorted datasets.

## Algorithm :

1. Initialization:
- Start with the first element of the array as the sorted region.

2. Select and Insert:
- Pick the next unsorted element and insert it into the correct position within the sorted region.

3. Shift Elements:
- Shift the larger elements to the right to make space for the selected element.

4. Repeat:
- Repeat steps 2 and 3 until all elements are sorted.


## Time Complexity:
  1. Worst Case: O(n^2) - (when the array is reverse-sorted).
  2. Average Case: O(n^2) 
  3. Best Case: O(n) - (when the array is already sorted).

## Space Complexity:
  Space Complexity: O(1) - Constant space.

## Stability:
- Stability: Stable.
- The relative order of equal elements is preserved during sorting.

## Advantages:
- Simple Implementation: Easy to understand and implement.
- Efficient for Small Datasets: Performs well on small datasets or partially sorted datasets.

## Disadvantages:
- Inefficiency for Large Datasets: Inefficient for large datasets compared to more advanced sorting algorithms.
- Quadratic Time Complexity: Can be slow on large datasets due to its quadratic time complexity.

## Applications:
- Small Datasets: Insertion Sort can be useful for sorting small datasets, especially when the dataset is almost sorted.
