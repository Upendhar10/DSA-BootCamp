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

# String Methods :
```
|      Method          |                      Description                                   | Return Type |
|----------------------|--------------------------------------------------------------------|-------------|
| compareTo()          | Compares two strings lexicographically                             | int         |
| compareToIgnoreCase()| Compares two strings lexicographically, ignoring case differences  | int         |
| charAt()             | Returns the character at the specified index (position)            | char        |
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
| hashCode()           | Returns the hash code of a string                                  | int         |
| length()             | Returns the length of a specified string                           | int         |
| split()              | Splits a string into an array of substrings                        | String[]    |
| startsWith()         | Checks whether a string starts with specified characters           | boolean     |
| isEmpty()            | Checks whether a string is empty or not                            | boolean     |
| contentEquals()      | Checks whether a string contains the same sequence of characters   
                          of the specified CharSequence or StringBuffer                     | boolean     |
| equals()             | Compares two strings. Returns true if the strings are equal, 
                          and false if not                                                  | boolean     |
| indexOf()            | Returns the position of the first found occurrence of specified 
                          characters in a string                                            | int         |
| lastIndexOf()        | Returns the position of the last found occurrence of specified 
                          characters in a string                                            | int         |
| replace()            | Searches a string for a specified value, and returns a 
                          new string where the specified values are replaced                | String      |
| replaceFirst()       | Replaces the first occurrence of a substring that matches the 
                          given regular expression with the given replacement               | String      |
| replaceAll()         | Replaces each substring of this string that matches the given 
                          regular expression with the given replacement                     | String      |
| subSequence()        | Returns a new character sequence that is a subsequence of this 
                          sequence                                                          | CharSequence|
| copyValueOf()        | Returns a String that represents the characters of the 
                          character array                                                   | String      |
| getChars()           | Copies characters from a string to an array of chars               | void        |
| regionMatches()      | Tests if two string regions are equal                              | boolean     |
| format()             | Returns a formatted string using the specified locale, 
                          format string, and arguments                                      | String      |
| getBytes()           | Encodes this String into a sequence of bytes using the named 
                          charset, storing the result into a new byte array                 | byte[]      |
| intern()             | Returns the canonical representation for the string object         | String      |
| matches()            | Searches a string for a match against a regular expression, 
                          and returns the match                                             | boolean     |
| offsetByCodePoints() | Returns the index within this String that is offset from the 
                          given index by codePointOffset code points                        | int         |
| codePointAt()        | Returns the Unicode of the character at the specified index        | int         |
| codePointBefore()    | Returns the Unicode of the character before the specified index    | int         |
| codePointCount()     | Returns the number of Unicode values found in a string             | int         |

```

# Why are Strings Immutable in Java?
- Immutable => Can't be Modified
- Strings are immutable in Java for Security reasons
- Example-1: Let's consider three 3 persons 
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
- Example-2 :
```
Public static void main(String args[]){
    String  s1 = "Suresh";
    String  s2 = "Suresh";

    System.out.println(s1 == s2);  // true  => address of s1 and s2 is same

    // Here, we are concatenating "Raina" to s1.
    // Since strings are immutable in Java, this operation creates a new String object with the value "SureshRaina" and assigns it to s1.
    // Note: The original "Suresh" String object remains unchanged.

    s1 = s1 + "Raina" // s1 = SureshRaina

    // In a String, a change in its value leads to a change in its address because Strings can't be modified.
    // This indirectly means a new string is created whenever a String object is modified.

    System.out.println(s1 == s2);  // false  => address of s1 and s2 is not same

    String s3 = "SureshRaina";
    // Here, a new String object s3 is created with the value "SureshRaina".
    // Even though s1 and s3 have the same value, they are different objects in memory because s1 was created through       
     concatenation.

    System.out.println(s1 == s3);  // false   
}
```

- To tackle this Immutability issue In Java, StringBuffer and StringBuilder classes are introduced.

# StringBuffer Vs StringBuilder

- StringBuffer and StringBuilder are non-primitive datatypes introduced to store text-format data.
- Since Java is a multi-threaded language, so two String mutability classes are introduced, one for a Single-threaded environment and the other for a multi-threaded environment.
- StringBuffer and StringBuilder classes are not literals, unlike the String class.

## StringBuffer
- Used in Multi-threaded environment
- Introduced in Java 1.0 version
- Less efficient than StringBuilder because of its Multi-threaded environment and Asynchronous nature.
##### Syntax : 
```
  DataType referenceVariable = new DataType (Object) ; 
  Where,
      DataType          => StringBuffer Class
      referenceVariable => Name of the StringBuffer
      'new' keyword     => Creates StringBuffer Object at Runtime or Dynamically
      Object            => Value of the StringBuffer.
```
Example :
```
  StringBuffer Name = new StringBuffer("Raju");
```

## StringBuilder
- Used in a Single-threaded environment 
- Introduced in Java 1.5 version
- More efficient than StringBuffer
#### Syntax
```
  DataType referenceVariable = new DataType (Object) ; 
  Where,
      DataType          => StringBuilder Class
      referenceVariable => Name of the StringBuilder
      'new' keyword     => Creates StringBuilder Object at Runtime or Dynamically
      Object            => Value of the StringBuilder.
```
Example :
```
  StringBuilder Name = new StringBuilder("Raju");
```

## StringBuilder Methods

- The StringBuilder class provides some of the important methods to work with the strings.
  
##### 1. append()
- The string passed as a parameter to the append method will be concatenated after the string on which the append method is applied.
- Code:
```
class StringBuilderExample{
//main method of class
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is an example of ");
    strSB.append("append method.");
    System.out.println(strSB);
    }
}

Output: "This is an example of append method.
```

#### 2. insert()
- The string passed as a parameter to the insert method will be inserted at the specified index (passed as a first parameter) of the string on which the insert method is applied.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a program");
    strSB.insert(10, "java ");
    System.out.println(strSB);
    }
}

Output: This is a java program
```

#### 3. replace()
- The string passed as a parameter to the replace method will replace all the characters that come in between the characters at the start & last index.
- This first & last index is passed as the first & second parameter in the replace method.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a program");
    strSB.replace(0, 9, "java");
    System.out.println(strSB);
  }
}

Output: java program
```

#### 4. delete()
- delete() will replace all the characters that come in between the characters at the start & last index.
- This first & last index is passed as the first & second parameter in the delete() method.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a program");
    strSB.delete(0, 10);
    System.out.println(strSB);
  }
}

Output: program
```

#### 5. reverse()
- The reverse() method will reverse the string on which the reverse method is applied.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a program");
    strSB.reverse();
    System.out.println(strSB);
  }
}
Output: margorp a si sihT

```

#### 6. capacity()
- The default capacity of StringBuilder is 16.
- The capacity of the builder can be increased by (capacity * n) + n.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder();
    System.out.println(strSB.capacity());
    strSB.append("This is a program");
    System.out.println(strSB.capacity());
  }
}

Output:
16
34

```

#### 7. length()
- length() method will return the length of the specified string.
- Code:

```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a java program");
    System.out.println(strSB.length());
  }
}

Output: 22

```

#### 8. deleteCharAt()
- The deleteCharAt() method will delete the character at the specified index passed as a parameter.
- Code:

```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a java program");
    strSB.deleteCharAt(6);
    System.out.println(strSB);
  }
}

Output: This i a java program

```

#### 9. setCharAt(int index, char ch)
- The setCharAt() method will set the specified char at the specified index passed as the first parameter while the second parameter will be the character.
- Code:
```
class StringBuilderExample{
public static void main(String args[]){
StringBuilder strSB = new StringBuilder("This is a java program");
strSB.setCharAt(8, 'n');
System.out.println(strSB);
}
}

Output: This is n java program

```

#### 10. indexOf()
- This method returns the first position’s index in the string for the specified substring passed as a parameter.
- Code:
```
class StringBuilderExample{
    public static void main(String args[]){
    StringBuilder strSB = new StringBuilder("This is a java program");
    System.out.println(strSB.indexOf("java"));
    }
}

Output: 10
```
- The StringBuilder class also has some other methods to work with the string which are listed below setLength(), toString(), trimToSize(), substring(), etc.
