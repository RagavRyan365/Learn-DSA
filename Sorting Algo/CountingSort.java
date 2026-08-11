class ContingSort{
  static int[] countingSort(int[] arr){
    //step 1 - build a array for counting------------------------------------
    int n = arr.length; // length of the Array
    int maxVal = arr[0];
    //Pick the maximum element from the input Array
    for(int i =1;i<n;i++){
      if(arr[i] > maxVal){
        maxVal = arr[i];
      }
    }
    int[] countArray = new int[maxVal+1];//created a counting array with the length of largest element in the input array
    //step 2 - write the counting for all elements in the input Array---------------------------
    for(int i=0;i<n;i++){
      countArray[arr[i]]++;//increment the count of the respective element in countArray
    }
    //step 3 - cummulative or prefix sum for the countArray---------------------------
    for(int i=1;i<maxVal+1;i++){
      countArray[i] += countArray[i-1];
    }
    //step 4 - building the sorted Array-----------------------------------
    int[] ansArr = new int[n];
    for(int i=n-1;i>=0;i--){
      ansArr[countArray[arr[i]]-1] = arr[i];
      countArray[arr[i]]--;
    }
    return ansArr;
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
      int[] arr = {64,23,25,1,2,3,11,1,4};//Input Array
      int [] sortArr = countingSort(arr);//store the final sorted array
      printArray(arr);//print array before sorting
      printArray(sortArr);//print the sorted array
  }
}
