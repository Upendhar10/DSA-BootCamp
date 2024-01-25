                                                            # DSA - MULTI-DIMENSIONAL ARRAYS


- A multi-dimensional array is an array of arrays.
- It can be considered as a table of rows and columns, where each cell can store a value.
- Multi-dimensional arrays are further divided into two types:
    1. 2D arrays
    2. Jagged arrays

# Two-Dimensional Arrays :
    
  - A 2D array is the most common type. It's like a table with rows and columns.
  - Also referred to as the matrix.

## syntax :

1. Literal format :
```
dataType [ ][ ]  2dArrayName = { elements of 2DArray };
```
Example : 
```
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

2. Using new keyword :
```
  int[ ][ ] 2dArrayName = new int[rows][columns];  
```

Example :
```
  int[ ][ ] matrix = new int[3][2];  where,
  no.of rows = 3
  no.of columns = 2
```
## Size of the matrix :
- To find the size of the matrix (number of rows and columns), we can use the length property:
```
int rows = matrix.length;  // Number of rows
int columns = matrix[0].length;  // Number of columns (assuming all rows have the same length)
```

## Accessing elements in  a 2D array :

- Accessing elements in a 2D array involves specifying both the row and column indices.
Example :
- To access the element in the third row and second column:

```
int value = matrix[2][1];  // Rows and columns are zero-indexed
```

## Insertion 

- Inserting an element involves assigning a value to a specific position in the matrix.
Example :
- To insert the value 42 in the fourth row and third column:
```
matrix[3][2] = 42;
```

## Deletion 
- Deletion is a bit tricky in standard arrays because the size of an array is fixed.
- However, we can simulate deletion by setting the value at a specific position to a default or sentinel value (e.g., 0 or -1), indicating that the element is "deleted."
- Although, this doesn't decrease the size of the matrix.
```
matrix[2][1] = -1;  // Simulating deletion by setting the value to -1
```


## Retrieval of Elements:
To retrieve all elements in the matrix, we would typically use nested loops to iterate through each row and column:
``` 
for (int i = 0; i < rows; i++) {            // iterating through each row
    for (int j = 0; j < columns; j++) {    // iterating through each column
        int value = matrix[i][j];
        // Process the value as needed
    }
}

```


# Jagged arrays :
- A jagged array is an array of arrays where each row can have a different number of elements.
- Unlike a regular 2D array, where all rows have the same number of columns, a jagged array allows for flexibility in the number of elements in each row.

## Syntax : 
```
int[][] jaggedArray = new int[3][];  // Declare a jagged array with 3 rows
```
Example :
Initialization of a Jagged array with 3 rows 
```
jaggedArray[0] = new int[]{1, 2, 3};   // First row has 3 elements
jaggedArray[1] = new int[]{4, 5};      // Second row has 2 elements
jaggedArray[2] = new int[]{6, 7, 8, 9}; // Third row has 4 elements
```

## NOTE :
- All other operations are very similar to that of the 2D array.
- However, since rows may have different lengths, be careful not to exceed the bounds of any particular row.

