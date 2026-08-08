# Sorting Alogorithms
---
### Selection Sort
Selection sort is comparision-based sort. It sort by selecting the smallest or largest element and swap it with the fisrt unsorted element  
    [ 64 25 22 11 ] i is the first unsorted element j start as i +1  
       i  j  
    [ 64 25 22 11 ]  
       i     j  
    [ 64 25 22 11 ] here the 11 is the smallest element so 64 and 11 is swaped position  
       i        j  
    [ 11 25 22 64 ] here also 22 is the smallestthen first unsorted element 25 so swap  
          i  j  
    [ 11 22 25 64 ]  
 - Time Complexity - O($n^2$)  
 - Space Complexity - O(1)  
---
### Bubble sort
Bubble sort is a simple sorting algorithm. It sort by repeatedly swaping the adjacent element if they are unordered  
    [64 25 22 11]  
     |  |        64 > 25 so swap  
     i j+1  
     j  
    [25 64 22 11]  
     |  |   |       64 > 22 swap  
     i  j  j+1  
    [25 22 64 11]  
     |     |  |     64 > 11 swap  
     i     j j+1  
    [25 22 11 64]  
     |  |           25 > 22 swap  
     j  i  
       j+1  
    [22 25 11 64]  
        |   |       25 > 11 swap    
        i  j+1  
        j  
    [22 11 25 64]  
      | |   |       22 > 11 swap
      j j+1 i  
    [11 22 25 64]  
 - Time Complexity - O($n^2$)  
 - Space Complexity - O(1)  
