class MergeSort{
  static void merge(int[]arr,int l,int mid,int h){
    int n1 = mid -l+1;//first half or left most array size
    int n2 = h-mid;//second half or right most arrray size
    int[] Left = new int[n1];//creating empty left half array
    int[] Right = new int[n2];//creating empty right half array
    for(int i=0;i<n1;i++){
      Left[i] = arr[l+i];//assigning the value to left half array
    }
    for(int j=0;j<n2;j++){
      Right[j] = arr[mid+1+j];//assigning the values to right half array
    }
    int i=0,j=0;// i is teh pointer for left array & j is teh pointer for rigth half array
    int k=l;// k is the pointerfor the real array
    while(i<n1 && j<n2){//loop run till any one of the value is false
      if(Left[i] <= Right[j]){//if the left element is smaller than right element
        arr[k] = Left[i];//left element is write into the array
        i++;//increment then i pointer to move  to next element
      }
      else{//if right element is smaller than left element
        arr[k] = Right[j];//right element is write into the array
        j++;//increment the j pointer to move to next element
      }
      k++;//incrementthe pointer k to write the next element
    }
    //if the array is not filled the remaining element from left or right arry is assign to the array
    while(i<Left.length){
      arr[k] = Left[i];
      i++;
      k++;
    }
    while(j<Right.length){
      arr[k] = Right[j];
      j++;
      k++;
    }
  }

  static void mergeSort(int[]arr,int l,int h){
    if(l < h){//only enter when the l < h
      int mid = l + (h-l)/2;//Finding the mid of the arry
      mergeSort(arr,l,mid);//calling the first half of the array recursively
      mergeSort(arr,mid+1,h);//calling the second half of the array recursively
      merge(arr,l,mid,h);//Merging the two half sorted wise
    }
  }
  //Print Array
  static void printArray(int[] arr){
      for(int num : arr){
          System.out.print(num + " ");
      }
      System.out.println("");
  }
  //main function
  public static void main(String[] args) {
      int[] arr = {64,23,12,25,11,5,6,10};//Input Array
      printArray(arr);//print array before sorting
      mergeSort(arr,0,arr.length-1);//Sort array
      printArray(arr);//print array after sorting
  }
}
