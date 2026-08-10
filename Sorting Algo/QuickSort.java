class QuickSort{
  static int partition(int[] arr,int l,int h){
    int piv = arr[h];
    int i = l-1;
    for(int j=l;j<h;j++){
      if(arr[j] < piv){
        i++;
        swap(arr,j,i);
      }
    }
    swap(arr,i+1,h);
    return i+1;
  }
  static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  static void quickSort(int[] arr,int l,int h){
    if(l < h){
      int piv = partition(arr,l,h);
      quickSort(arr,l,piv-1);
      quickSort(arr,piv+1,h);
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
      int[] arr = {64,23,25,11};//Input Array
      printArray(arr);//print array before sorting
      quickSort(arr,0,arr.length-1);//Sort array
      printArray(arr);//print array after sorting
  }
}
