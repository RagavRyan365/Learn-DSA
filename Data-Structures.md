# Data Stuctures
 - Array
 - String
 - LinkedList
 - HashMap
 - Stack
 - Queue
 -Tree

## Arrays
Declaration Syntex:

      <DataType>[] <ArrayName> = {<value2>,<value1>};//add value inside the {} for predefined Array
      <DataType>[] <ArrayName> = new <DataType>[<ArraySize>];//In java array are in fixed size you need to give arraysize to create it

Nested Array:

      <DataType>[][] <ArrayName> = {{},{}};

Mutable array:

      List<DataType> <ArrayName> = new ArrayList<>()

Accessing Syntex:

      <ArrayName>[<Index>]//it returns the element value in index
      <ArrayName>[<Index>] = <Value>;//ued to change value in a index

Methods:

      .length - return the length of the Array
      .clone - return the array as a new array you can store it in another array
      others:
        Arrays.sort(<Array>) - sort the array;
        Arrays.toString(<Array>) - to convert it into String mostly used for printing the array
        Arrays.deepToString(<Array>) - to print nested aray
        Arrays.binarySearch(<Array>,<Element>) - returns the index of the elementin the array if element is not found return -1
        Arrays.equals(<Array1>,<Array2>) - return boolean value check the given two array are same
        Arrays.copyOf(<Array>,<Size>) - to copy or resizing the array

## String
Declaration Syntex:

      String <StringName> = "<Value>";

Methods:

      .length() - return the length of the string
      <String1>.equals(<String2>) - return boolean value checking if the String1 and String2 values are equal
      .toCharArray() - return a character array of the String
      .charAt(<Index>) - return the specific character in the Index like Array
      .substring(<startIndex>,<endIndex>) - return the substring
      .spilt("<char>") - split the String based on the char inside the function
      .contains("<substring or char>") - check if the substring or char in the String
      .indexOf("<char>") - return the first occurrence of the char
      .lastIndexOf("<char>") - return the last occurrence of the char

## LinkedList
Declaration Syntex:

      LinkedList<<DataType>> <ListName> = new LinkedList<>();built in linkedlist object

      //for custom linkedlist
      class Node{
        int data;
        Node next
        Node(int data){
          this.data = data;
          this.next = null;
        }
      }
      //Declaration in code as
      Node <ListName> = new Node(<Value>)

Methods:

        .add(<data>) - add at end
        .addFirst(<data>) - add at Start
        .addLast(<data>) - add at end
        .get(<Index>) - get element at index it is not like array it move through each node to find the element
        .getFirst() & .getLast
        .set(<data1>,<data2>) - replace element
        .remove() - remove first element
        .remove(<Index>) - remove element in spacific index
        .removeFirst & .removeLast
        .contains(<data>) - check the element exist
        .size() - return the length of the LinkedList
        .isEmpty() - check empty
        .clear - remove everything

##HashMap
Declaration:

    HashMap<<KeyDataType>,<ValueDataType>> <MapName> = new HashMap<>

Methods:

    .size() - return the size of the map
    .put(<Key>,<Value>)
    .putIfAbsent(<key>,<Value>) - add the key and value to the map only if the key is not in the map it does not return the added value
    .get(<Key>)
    .getOrDefault(<Key>,<DefaultValue>) - get the value of the key from map if exist if not return the default value
    .computeIfAbsent - it like .putIfAbsent methos but it return the added value
    .containsKey(<Key>) - check the key is exist in the map
    .containsValue(<Value>) - check value is exist in the map
    .remove(<Key>) - remove the key from the map
    .isEmpty()
    .keySet() - get all keys
    .values() - get all values
    .entrySet() - get Key + value pairs

##Stack
Declaration Syntex:

    Stack<DataType> <StackName> = new Stack<>();

Methods:

    .push(<Value>) - to add the value on the top
    .pop() - remove the top element and also retun it
    .peek() - return the top element
    .isEmpty()
    .search(<Value>) - Find positino from top
    .size() - return the size(No. element)
    .contains(<Value>)
    .clear - remove everything

## Queue

    Dequeue(DQ)<-- |1|2|3| <--Enqueue(NQ)

Declaration Syntex:

    Queue<DataType> <QueueName> = new LinkedList<>()
    Queue<DataType> <QueueName> = new ArrayDeque<>()
    //we can declar queue with bothe LinkedList and ArrayDeque but ArrayDeque is best option because of storage
    //ArrayDeque use array internally to store queue(resizable circular array)

Methods:

    -Enqueue(NQ)
    .offer(<Value>) - add element

    -Dequeue(DQ)
    .poll() - remove & return the element

    .peek() - retun the first element
    .isEmpty
    .size()
    .contains(<Value>)
    .clear()

##Tree

### TreeSet
 - It is basically a set store only unique value and sort it in ascending

Declaration Syntex:

    TreeSet<<DataType>> <TreeName> = new TreeSet<>()

Methods:

    .add(<Value>)
    .remove(<Value>)
    .contains(<Value>)
    .first()
    .last()
    .size()
    .isEmpty()

###TreeMap
 - Store the value in key-value pair like HashMap it automatically balance it whwn a element is added or remove is simply a rep from Red-Black tree

Declaration Syntex:

    TreeMap<<KeyDataType-Integer>,<ValueDataType>> <TreeName> = TreeMap<>()

Methods:

    .put(<Key>,<Value>)
    .get(<Key>)
    .remove(<Key>)
    .containsKey(<Key>)
    .firstKey()
    .lastKey()
    .size()

###Binary Tree / BST (Binary Search Tree)

Declaration Syntex:

    class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val){
        this.val = val;
      }
    }

