                                            DSA: 1D ARRAYS 

## Definition :
- An Array is a collection of elements of similar data types stored in a continuous memory location
- Array elements can be accessed using indexes, and they follow 0-based indexing by default.
- Array is stored in the heap memory but the referenceVariable is stored in the Stack Memory.
- In Java, we have three types of arrays,
  1. One Dimensional Array  (1D)
  2. Two Dimensional Array  (2D)
  3. Jagged Array.

## Note :

- In C/C++ arrays are stored in continuous memory locations but, In Java,
    1. We don't have the concept of pointers
    2. Objects in Heap memory, may or may not be stored in the continuous memory locations
        (depends on the JVM)
    3. Since Array Objects are stored in the Heap memory, hence Array objects may or may not be
        stored in the continuous memory locations.
    4. Default values of int[] are 0, and String[] is null and boolean is false.

## Creating a 1D Array
    
1. Dynamic memory allocation => Runtime array creation using the 'new' keyword
   
    ```
        dataType[] referenceVariable  = new dataType[size];
        where,
                dataType            =>  defines the type of data stored in the array
                []                  => defines that this is an array
                referenceVariable   => array Name, stored in Stack
                'new' keyword       => Used to create an array object during runtime in the heap
                size                => used to provide the length of the array

     ```

2. Array Literal =>  Compile time 
    ```
        dataType[] referenceVariable = {array elements};

        Eg: String[] Alphabets = {'A','B','C','D','E','F'};
                
    ```
3. Array Literal + new keyword
   
   ```
        datatype [] books;              // Declaration => books is defined in the stack at compile time
        books = new int[] {array elements} // initialization => memory will be allocated in heap memory at runtime   
    ```

## Accessing array elements :
  
- Array elements can be accessed using their index.

    ```
    int[] arr1 = {12,13,16,18}
    arr1[1] = 13;        // value at index 1
    ```

## Traversing array elements :

- Using loops we can traverse the entire array
- We can obtain the length of the array using {arr.length property}.
- array starts from 0 index and ends at arr.length-1
  
    ```
    for(int i=0; i<arr.length; i++){
        sout(arr[i]); // printing array elements in line by line
    }
    ```

## Updation:
- You can manipulate the values in an array by assigning new values to specific indices.
  
```
    int[] myArray = {10, 20, 30, 40, 50};

    // Modifying values
    myArray[1] = 25;   // Changing the value at index 1 to 25

```

## Insertion:
- To insert a value at a specific index, you need to shift the existing elements to create space for the new element.
- This can be achieved in two ways, 
  1. Using an additional array
  2. Inplace insertion

#### Using additional space
```
    int[] myArray = {10, 20, 30, 40, 50};
    int newSize = myArray.length + 1;
    int[] newArray = new int[newSize];

    int insertIndex = 2;  // Index where you want to insert the new value
    int newValue = 35;    // Value to insert

    // Copy elements before the insertion point
    for (int i = 0; i < insertIndex; i++) {
        newArray[i] = myArray[i];
    }

    // Insert the new value
    newArray[insertIndex] = newValue;

    // Copy elements after the insertion point
    for (int i = insertIndex + 1; i < newSize; i++) {
        newArray[i] = myArray[i - 1];
    }

    // Update the reference to point to the new array
    myArray = newArray;

```
#### In-place insertion
  1. Insertion at a Specific Index:
Shift Elements to Make Room: If we want to insert a new element at a specific index, we need to shift all the elements to the right to create space for the new element.
2. Insert the New Element: Once there is enough space, insert the new element at the desired index.

```
public class InsertAtSpecificIndex {
    public static void insertAt(int[] array, int index, int value) {
        // Shift elements to the right to create space
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Insert the new value at the specific index
        array[index] = value;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int newValue = 99;

        insertAt(arr, index, newValue);

        // Output: [1, 2, 99, 3, 4]
        System.out.println(Arrays.toString(arr));
    }
}

```

## Deletion 
- To delete a value at a specific index, we need to shift the existing elements after we delete the required element.
- This can be achieved in two ways, 
  1. Using an additional array
  2. Inplace insertion'
   
#### Using an additional array
- When deleting an element at a specific index, the elements after the deletion point need to be shifted to fill the gap.
  
```
int[] myArray = {10, 20, 30, 40, 50};
int deleteIndex = 2;

// Deleting at a specific index
int newSize = myArray.length - 1;
int[] newArray = new int[newSize];

// Copying elements before the deletion point
for (int i = 0; i < deleteIndex; i++) {
    newArray[i] = myArray[i];
}

// Copying elements after the deletion point
for (int i = deleteIndex + 1; i < myArray.length; i++) {
    newArray[i - 1] = myArray[i];
}

// Update reference to the new array
myArray = newArray;

```

#### In-place Insertion
- Deletion at a Specific Index: 
  
1. Shift Elements to Close the Gap: If we want to delete an element at a specific index, we need to shift all the elements to the left to close the gap left by the deleted element.

2. Remove the Element: Once the gap is closed, the last element (which is now a duplicate) can be ignored or set to a default value.

```
public class DeleteAtSpecificIndex {
    public static void deleteAt(int[] array, int index) {
        // Shift elements to the left to close the gap
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Set the last element to a default value or ignore it
        array[array.length - 1] = 0;  // Default value (adjust as needed)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;

        deleteAt(arr, index);

        // Output: [1, 2, 4, 5, 0]
        System.out.println(Arrays.toString(arr));
    }
}

```

## Built-in Arrays Methods

1. toString(T[] array): Returns a string representation of the contents of the specified array.
```
int[] arr = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(arr));   // Output: [1, 2, 3, 4, 5]
```

2. equals(T[] a, T[] b): Returns true if the two specified arrays of objects are equal.
```
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2));  // Output: true

```

3. sort(T[] array) (for primitive types) and 
   sort(T[] array, Comparator<? super T> c) (for objects): Sorts the specified array of objects into ascending order.
```
int[] arr = {5, 2, 8, 1, 3};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));   // Output: [1, 2, 3, 5, 8]

```

4. fill(T[] array, T value) (for primitive types) and 
fill(T[] array, int fromIndex, int toIndex, T value) (for objects):
- Assigns the specified value to each element of the specified array.

```
int[] arr = new int[5];
Arrays.fill(arr, 10);
System.out.println(Arrays.toString(arr));  // Output: [10, 10, 10, 10, 10]

```

5. copyOf(T[] original, int newLength) (for primitive types) and 
    copyOf(T[] original, int newLength, Class<? extends T[]> newType) (for objects):
   - Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.
```
int[] arr = {1, 2, 3};
int[] newArr = Arrays.copyOf(arr, 5);
System.out.println(Arrays.toString(newArr));  // Output: [1, 2, 3, 0, 0]
```

6. binarySearch(T[] a, T key) (for primitive types) and 
   binarySearch(T[] a, int fromIndex, int toIndex, T key) (for objects):
   - Searches the specified array of objects for the specified value using binary search.
```
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3);
System.out.println("Index of 3: " + index);  // Output: 2

```
7. asList(T... a): Returns a fixed-size list backed by the specified array.
```
String[] arr = {"apple", "orange", "banana"};
List<String> list = Arrays.asList(arr);
System.out.println(list);  // Output: [apple, orange, banana]
```

## Array Operations Time Complexity Cheat-Sheet:
1. Accessing Values: Accessing an element by index: O(1)
   
2. Insertion Operations:
    a. Insert at the end: O(1)
    b. Insert at a specific index (with shifting): O(n)

3. Deletion Operations:
    a. Delete at the end: O(1)
    b. Delete at a specific index (with shifting): O(n)

4. Copying elements to a new array: O(n)
