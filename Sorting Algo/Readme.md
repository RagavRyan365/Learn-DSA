# Sorting Algorithms

### Selection Sort
Selection sort is comparison-based sort. It sort by selecting the smallest or largest element and swap it with the first unsorted element.

    [ 64 25 22 11 ] i is the first unsorted element j start as i +1  
       i  j  
    [ 64 25 22 11 ]  
       i     j  
    [ 64 25 22 11 ] here the 11 is the smaller element so 64 and 11 is swapped position  
       i        j  
    [ 11 25 22 64 ] here also 22 is the smaller then first unsorted element 25 so swap  
          i  j  
    [ 11 22 25 64 ]  
 - Time Complexity - O($n^2$)  
 - Space Complexity - O(1)  

### Bubble sort
Bubble sort is a simple sorting algorithm. It sort by repeatedly swapping the adjacent element if they are unordered.

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

### Insertion Sort
Insertion sort is a simple sorting algorithm. It sort the list by inserting  the smallest or largest element in its sorted position, and  moving other element back by one step to create space for the element to insert in the list.

![Insertion Algo Explain Img](https://media.geeksforgeeks.org/wp-content/uploads/20240802210251/Insertion-sorting.png)

 - Time Complexity  
    - $\Omega$(n) - if the list already sorted - Best Case
    - O($n^2$) - Worst Case
    - $\Theta$($n^2$) - Average Case
 - Space Complexity - O(1)

### Merge sort
Merge sort works by divide and conqure method, the whole array is separated into small block the small blockes are sorted first then it merge to give the final sorted list.

<img src="https://www.programiz.com/sites/tutorial2program/files/merge-sort-example_0.png" width="500" height="500" alt="Merge Sort Algo Img">

 - Time Complexity - O(nlogn) --> log n for dividing and n for merging
 - Space Complexity - 0(n)

### Quick sort
Quick is also sorting algoritham based on divide and conqure method. first a pivot is choice from the array it may be center element or starting or ending element than the remaining element are compared with the pivot element the elements that are smaller than pivot are set in front of the pivot and elements that are larger than pivot are move to the back of the pivot. This process repeatedly recursively through all the sub array.

![Quick Sort Algo Img](https://miro.medium.com/v2/resize:fit:640/format:webp/1*Ws_Vgq53aHVqdVyStmpHTw.jpeg)

 - Time Complexity  
    - $\Omega$(nlogn) - Best Case
    - O($n^2$) - Worst Case
    - $\Theta$(nlogn) - Average Case
 - Space Complexity
   - $\Omega$(nlogn) - Best Case
   - O(n) - Worst Case

### Counting sort
step 1:
Building or defining the couting array, the size of the counting  array is largest element in the input Array
step 2:
Wrinting the count of each element in the input array on couting Array

      input = [1,5,3,5]
      couting = [0,1,0,1,0,2] -- size is 5 the largest element in input Array as in step 1
          index  0 1 2 3 4 5

step 3:
Taking cummuletive or prefix sum for the counting array

      counting = [0,1,0,1,0,2]
      after taking cummuletive or prefix sum
      counting = [0,1,1,2,2,3]

step 4:
Building the Sorted array, now after step 3the counting array has the index of every element for the sorted array. Start itrating the input array from the back and write the value using the counting array and return the sorted array... for further understading look the counting sort code
 - N - number of elementin input array K - largest element in the input array
 - Time Complexity - O(N+K)
 - Space complexity - o(N+K)
