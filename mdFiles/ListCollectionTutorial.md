# Java List Collection Tutorial
<details>
  <summary>What is a Collection ?</summary>

1. An array simply stores a fixed number of objects, whereas a collection stores objects dynamically, you can add or remove objects as you wish.
2. A collection also provides useful operations such as adding, removing, retrieving objects.
</details>

---
<details>
    <summary> What is Java Collections Framework ? </summary>

- Java Collections Framework is a set of reusable data structures and algorithms.
- Java Collections Framework provides common data structures implementations such as list, set, map, queue, tree, etc.
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
    }
}
```
</details>

---
<details>
    <summary>What are Generics in Java ? </summary>

- Allows programmers to write parameterized code.
</details>

---
<details>
    <summary> List Nedir ? </summary>

  - List collection stores elements by insertion order (either at the end or at a specific position in the list.)
    <details>
    <summary>Primary methods defined in the java.util.List interface : </summary>

    ![](../../../AppData/Local/Temp/List Collections API.png)
    </details>
</details>

---
<details>
    <summary>ArrayList Nedir ?</summary>

- The *List* is the base interface for all list types, and ArrayList and LinkedList classes are two common List's impleementations.
- **ArrayList:**
- **ArrayList** An implementation that stores elements in a backing array.
- The array's size will be automatically expanded if there isn't enough room when adding new elements into the list.
- It's possible to set the default size by specifying an initial capacity when creating a new ArrayList.
- Basically an ArrayList offers constant time for the following operations : *size, isEmpty, get, set, iterator, listIterator*
- constant time for the **add** operation.
- linear time for other operations.
- Therefor, this implementation can be considered if we want fast, random access of the elements.
</details>

---
<details>
    <summary>LinkedList Nedir ?</summary>

- LinkedList: An implementation that stores elements in a doubly-linked list data structure.
- It offers constant time for adding and removing elements at the end of the list.
- And Linear time for operations at other positions in the list.
- Therefor, we can consider using a LinkedList if fast adding and removing elements at the end of the list is required.
- Besides ArrayList and LinkedList, **Vector** is thread-safe, but ArrayList and LinkedList are not.
- Interface tree of List collections: 
- ![](../../../AppData/Local/Temp/List Collections class diagram.png)
</details>

---
<details>
    <summary>Creating a new list</summary>

- It's a good practice to declare a list instance with a generic type parameter, for example :

```java
import Java101.Employee;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Lits<Object> listAnything = new ArrayList<Object>();
        List<String> listString = new ArrayList<String>();
        List<Integer> listInteger = new ArrayList<>(String);
        List<String> linkedWords = new LinkedList<String>();
        var employees = new ArrayList<Employee>(); // java 10
        List<Integer> list1;
        List<Integer> list2 = new ArrayList<>(list1); // takes elements from an existing collection.
    }
}
```
- When creating a new ArrayList using the empty consturctor, the list is constructed with an initial capacity of ten.
</details>

---
<details>
    <summary>Basic List operations </summary>

<details>
    <summary>Adding elements to a List</summary>
    
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("One");
        listString.add("Two");
        listString.add(1, "Three");
        
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("Yako");
        listStrings.add("Pako");
        
        List<String> listWords = new ArrayList<>();
        listWords.add("WORD1");
        listWords.add("WORD2");
        listWords.addAll(listStrings);

        System.out.println(listWords);
    }
}
```
</details>
<details>
    <summary>Retrieving elements from a List</summary>

- The **get()** method is used to retrieve an element from the list.
- **getFirst()** and **getLast()** methods are specific to the LinkedList class.
```java
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("ABC");
        listStrings.add("DEF");

        LinkedList<Integer> linkedNumbers = new LinkedList<Integer>();
        linkedNumbers.add(111);
        linkedNumbers.add(222);
        linkedNumbers.add(333);
        linkedNumbers.add(444);

        String element = listStrings.get(1);
        Number number = linkedNumbers.get(3);
        System.out.println(element);
        System.out.println(number);

        System.out.println(linkedNumbers.getFirst());
        System.out.println(linkedNumbers.getLast());
    }
}
```
</details>
<details>
    <summary>Updating elements in a List</summary>

- **set(index, element)** method to replace the element at the specified index by the specified element.
```java
public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("ABC");
        listStrings.add("DEF");

        listStrings.set(0, "GHI");
        System.out.println(listStrings);
    }
}
```
</details>
<details>
    <summary>Removing elements from a List</summary>

- Use **remove(index)** or **remove(Object)** method which removes the specific element at the specific index or by Object reference.
```java
public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("GHI");
        listStrings.add("DEF");

        listStrings.set(0, "ABC");
        System.out.println(listStrings);

        listStrings.add("GHI");
        listStrings.add("JKL");
        System.out.println(listStrings);

        listStrings.remove(2);
        System.out.println(listStrings);

        listStrings.remove("ABC");
        System.out.println(listStrings);

    }
}
```
- To remove all elements in the list, use the **clear()** method
</details>
<details>
    <summary>Iterating over elements in a list</summary>

- We can use enhanced for loop to iterate through all elements in the list.
```java
public class Main{
    public static void main(String[] args){
        for(String element : listStrings){
            System.out.println(element);
        }
    }
}
```
- or use iterator like this :

```java
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<Number> iterator = linkedNumbers.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
```
> since java 8 we can use the forEach() method like this : 
```java
public class Main{
    public static void main(String[] args) {
        linkedNumbers.forEach(n -> System.out.println(n));
        linkedNumbers.forEach(System.out::println);
    }
}
```
</details>
<details>
    <summary>Searching for an element in a list</summary>

- boolean contains(Object): returns **true** if the list contains the specified element.
- int indexOf(Object): returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
- int lastIndexOf(Object): returns the index of the last occurrence of the specified element in the list, or -1 if the element is not found.
```java
public class Main {
    public static void main(String[] args) {
        if(listStrings.contains("ABC")){
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
        int firstIndex = linkedNumbers.indexOf(444);
        int lastIndex = listStrings.indexOf("DEF");
    }
}
```
</details>
<details>
    <summary>Sorting a list</summary>

```java
public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("D");
        listStrings.add("C");
        listStrings.add("F");
        listStrings.add("E");
        listStrings.add("B");
        listStrings.add("A");

        System.out.println("before sorting: "+listStrings);
        Collections.sort(listStrings);
        System.out.println("after sorting: "+listStrings);
    }
}
```
- List interface intoduces the sort() method, so you can sort elements in an ArrayList or LinkedList directly like this : **listStrings.sort(null);**
</details>
<details>
    <summary>Copying elements from one list into another</summary>

- The **Collections.copyList(dest, src)** static method allows us to copy all elements from the source list into the destination one.
- Note that the destination list must be large enough to contain the entire source list.
```java
public class Main {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<String>();
        sourceList.add("D");
        sourceList.add("C");
        sourceList.add("B");
        sourceList.add("A");

        List<String> destinationList = new ArrayList<String>();
        destinationList.add("X");
        destinationList.add("Y");
        destinationList.add("W");
        destinationList.add("V");
        destinationList.add("Z");

        System.out.println("destinationList before copy: "+destinationList);
        Collections.copy(destinationList, sourceList);
        System.out.println("destinationList after copy: "+destinationList);
    }
}

```
</details>
<details>
    <summary>Shuffling elements in a list</summary>
    
- To randomly permute elements in a list, use the **Collections.shuffle()** static method.
```java
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        for(int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println("List before shuffling: "+numbers);
        Collections.shuffle(numbers);
        System.out.println("List after shuffling: "+numbers);
    }
}
```
</details>
<details>
    <summary>Reversing elements in a list</summary>

- To reverse order of elements in a list, use the **Collections.reverse()** static method.
```java
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println("List before reversing: "+numbers);
        Collections.reverse(numbers);
        System.out.println("List after reversing: "+numbers);
    }
}
```
</details>
<details>
    <summary>Extracting a portion of a list</summary>

- The **subList(fromIndex, toIndex)** allows us to get a partion of the list between the specified **fromIndex(inclusive)** and **toIndex(exclusive)**
```java
public class Main {
    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Tom", "John", "Peter", "Alice", "Gigi", "Jesse");
        System.out.println("Original list: "+listNames);
        List<String> subList = listNames.subList(2, 5); // 2 inclusive 5 exclusive
        System.out.println("subList: "+subList);
    }
}
```
</details>
<details>
    <summary>Converting between Lists and arrays</summary>

- The Java Collection Framework allows us to easily convert between lists and arrays.
- The **Arrays.asList(T... a)** method converts an array of type **T** to a list of type **T**
```java
public class Main {
    public static void main(String[] args) {
        List<String> listNames = Arrays.asList("Tom", "John", 
                "Peter", "Alice", "Gigi", "Jesse");
        List<Integer> listNumbers = Arrays.asList(1,2,3,4);
        System.out.println(listNames);
        System.out.println(listNumbers);
    }
}
```
- And the **List** interface provides the toArray() method that returns an array of Objects containing all of the elements in the list in proper sequence (from the first to last element)
```java
public class Main {
    public static void main(String[] args) {
        List<String> listWords = new ArrayList<>();
        listWords.add("HAHAHA");
        listWords.add("DUDE");
        listWords.add("MEANT");
        Object[] arrayWords = listWords.toArray();
        for (Object s : arrayWords){
            System.out.println(s);
        }
    }
}

```
</details>
<details>
    <summary>List to Stream</summary>

- You can convert a List to a stream :
- **List.stream() :** returns a sequantial stream.
- **List.parallelStream() :** returns a possibly parallel stream.
```java
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);

        int sum = numbers.stream().reduce(0, (x,y) -> x+y);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum2);
    }
}

```
[more about Steram API](https://www.codejava.net/java-core/collections/understanding-java-8-stream-api)
</details>
<details>
    <summary>Concurrent lists</summary>

- By default, **ArrayList** and **LinkedList** are not thread-safe, so if you want to use them in concurrent context, you have to synchorinze them externally using the **Collections.synchronizedList()** static method which returns a synchronized list that wraps the specified list.
- 
```java
public class Main {
    public static void main(String[] args) {
        List<Object> unsafeList = new ArrayList<Object>();
        List<Object> safeList = Collections.synchronizedList(unsafeList);

        synchronized(safeList){
            Iterator<Object> iterator = safeList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
```
</details>
</details>



<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>d

















-----------------------------------------------------------------------------------------
<details>
  <summary>A</summary>

```java
public class Main{
    public static void main(String[] args) {
        MyList<Integer> l = new MyList<>();
        System.out.println("Liste durumu: "+(l.isEmpty() ? "Empty" : "Not empty"));
        l.add(1);
    }
}
```
</details>

<details>
  <summary>B</summary>

- Collection sinifi biraz zordur
- ogrenmek kolay degildir.
> wow
</details>
