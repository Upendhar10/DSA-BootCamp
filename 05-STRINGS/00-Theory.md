                                                           #  DSA: STRINGS 

- String is a non-primitive datatype.
- A String is a sequence of characters.
- String is a class in Java used to store text-format data.
- Although it is a class, Java handles String very differently than other Classes so it 
  is considered as a literal due to its unique behavior.

## How Strings are Stored in Memory?
- Storage of Strings depends on 'How the String Object is created'
- Two Ways to Create Strings
### 1. String Literal
- String literal will not be stored directly in the Heap, rather it will get stored in String pool inside
      the Heap

#### Syntax :
```
  DataType referenceVariable = Object ; 
      Where,
          DataType => String Class
          referenceVariable => Name of the String
          Object => Value of the String
```
  #### Example :
      String Name = "Robinson";

  #### String Pool :
  - A Separate memory location in the Heap
  - Repeated Objects will not be created in the String pool,
    - As a result, if two or more reference variables hold the same Object,
    all of them will be pointing to a single Object in the pool
  - Primary reason why there exists a String pool is, for Memory Optimization

### 2. Creating String using the 'new' keyword
- Creates Objects in the Heap memory but, outside the String pool
- As a result, we can create similar objects for multiple different reference Variables

#### Syntax :
```
  DataType referenceVariable = new DataType (Object) ; 
  Where,
      DataType          => String Class
      referenceVariable => Name of the String
      'new' keyword     => Creates String Object at Runtime or Dynamically
      Object            => Value of the String.
```
#### Example :
```
  String Name = new String ();    // Empty String
  String Name = new String ("Robinson");
```
Note: When we create Strings Dynamically, i.e., Using the 'new' keyword  then, these String Objects will be created directly in Heap.

# String Comparison 
- String comparison can be done  in two ways
  1. Using (==) Operator
  2. Using (.equals) function

## Using (==) Operator
- Using (==) we will be comparing whether two Strings are stored in the same reference address or not.
- for comparison, Considers the address to which, two reference variables are pointing, 
- Checks if two reference variables pointing to the same Object
                Eg : name1 --> "Ben" <--- name2
```
  String name1 = "Ben";
  String name2 =  new String("Ben");
  System.out.println(name1 == name2);    // false
```
- Although name1 and name2 hold the same data, (==) returns false, because both the strings are stored in different addresses.

## Using (.equals) function
- Using (.equals) we will be comparing whether two Strings have the same value or not, irrespective of their address location
- for comparison, Consider the values of the two reference variables, 
- Checks if two reference variables possess the same Object value
    Eg : name1 = "Ben"
         name2 = "Ben"
```
    String name1 = "Ben";
    String name2 =  new String("Ben");
    System.out.println(name1.equals(name2));  // true
```
- name1 and name2 hold the same data, hence (.equals) returns true, because both the strings have the same values.

# Why are Strings Immutable in Java?
- Immutable => Can't be Modified
- Strings are immutable in Java for Security reasons
  Example: Let's consider three 3 persons
```
          String p1 = "Arjun";
          String p2 = "Arjun";
          String p2 = "Arjun";

          Here,
            1. String Object (Arjun) is Stored in the String Pool
            2. We Observe that,
               A single Object is referenced by multiple reference variables i.e.,
                  p1 ---------->  Arjun
                  p2 ---------->  Arjun
                  p3 ---------->  Arjun

            3. If we try to Change the value of a single reference variable,
               all the remaining values of the other reference variables will also be changed because they are
               stored in a String pool and a String pool doesn't contain repeated similar objects i.e.,
                   p2 = Raju, then
                   p1 -- p2 --- p3 -----------> Raju
```


# String Methods :
```
|      Method          |                      Description                                   | Return Type |
|----------------------|--------------------------------------------------------------------|-------------|
| charAt()             | Returns the character at the specified index (position)            | char        |
| codePointAt()        | Returns the Unicode of the character at the specified index        | int         |
| codePointBefore()    | Returns the Unicode of the character before the specified index    | int         |
| codePointCount()     | Returns the number of Unicode values found in a string             | int         |
| compareTo()          | Compares two strings lexicographically                             | int         |
| compareToIgnoreCase()| Compares two strings lexicographically, ignoring case differences  | int         |
| concat()             | Appends a string to the end of another string                      | String      |
| contains()           | Checks whether a string contains a sequence of characters          | boolean     |
| substring()          | Returns a new string which is the substring of a specified string  | String      |
| toCharArray()        | Converts this string to a new character array                      | char[]      |
| toLowerCase()        | Converts a string to lowercase letters                             | String      |
| toString()           | Returns the value of a String object                               | String      |
| toUpperCase()        | Converts a string to upper case letters                            | String      |
| trim()               | Removes whitespace from both ends of a string                      | String      |
| valueOf()            | Returns the string representation of the specified value           | String      |
| endsWith()           | Checks whether a string ends with the specified character(s)       | boolean     |
| equalsIgnoreCase()   | Compares two strings, ignoring case considerations                 | boolean     |
| getChars()           | Copies characters from a string to an array of chars               | void        |
| hashCode()           | Returns the hash code of a string                                  | int         |
| intern()             | Returns the canonical representation for the string object         | String      |
| length()             | Returns the length of a specified string                           | int         |
| regionMatches()      | Tests if two string regions are equal                              | boolean     |
| split()              | Splits a string into an array of substrings                        | String[]    |
| startsWith()         | Checks whether a string starts with specified characters           | boolean     |
| isEmpty()            | Checks whether a string is empty or not                            | boolean     |
| contentEquals()      | Checks whether a string contains the same sequence of characters   
                          of the specified CharSequence or StringBuffer                     | boolean     |
| copyValueOf()        | Returns a String that represents the characters of the 
                          character array                                                   | String      |
| equals()             | Compares two strings. Returns true if the strings are equal, 
                          and false if not                                                  | boolean     |
| format()             | Returns a formatted string using the specified locale, 
                          format string, and arguments                                      | String      |
| getBytes()           | Encodes this String into a sequence of bytes using the named 
                          charset, storing the result into a new byte array                 | byte[]      |
| indexOf()            | Returns the position of the first found occurrence of specified 
                          characters in a string                                            | int         |
| lastIndexOf()        | Returns the position of the last found occurrence of specified 
                          characters in a string                                            | int         |
| matches()            | Searches a string for a match against a regular expression, 
                          and returns the match                                             | boolean     |
| offsetByCodePoints() | Returns the index within this String that is offset from the 
                          given index by codePointOffset code points                        | int         |
| replace()            | Searches a string for a specified value, and returns a 
                          new string where the specified values are replaced                | String      |
| replaceFirst()       | Replaces the first occurrence of a substring that matches the 
                          given regular expression with the given replacement               | String      |
| replaceAll()         | Replaces each substring of this string that matches the given 
                          regular expression with the given replacement                     | String      |
| subSequence()        | Returns a new character sequence that is a subsequence of this 
                          sequence                                                          | CharSequence|

```
