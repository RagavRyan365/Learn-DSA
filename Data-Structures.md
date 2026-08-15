# Data Stuctures
 - Array
 - String
 - LinkedList
 - HashMap

## Arrays

    Declaration Syntex:
      <DataType>[] <ArrayName> = {<value2>,<value1>};//add value inside the {} for predefined Array
      <DataType>[] <ArrayName> = new <DataType>[<ArraySize>];//In java array are in fixed size you need to give arraysize to create it

      Nested Array - <DataType>[][] <ArrayName> = {{},{}};

    Accessing Syntex:
      <ArrayName>[<Index>]//it returns the element value in index
      <ArrayName>[<Index>] = <Value>;//ued to change value in a index

    Methods:
      .length - return the length of the Array
      others:
        Arrays.sort(<Array>) - sort the array;
        Arrays.toString(<Array>) - to convert it into String mostly used for printing the array
        Arrays.deepToString(<Array>) - to print nested aray
        Arrays.binarySearch(<Array>,<Element>) - returns the index of the elementin the array if element is not found return -1
        Arrays.equals(<Array1>,<Array2>) - return boolean value check the given two array are same
        Arrays.copyOf(<Array>,<Size>) - to copy or resizing the array

## String
