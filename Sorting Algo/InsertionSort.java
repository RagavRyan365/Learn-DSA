class InsertionSort{
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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
        insertionSort(arr);//Sort array
        printArray(arr);//print array after sorting
    }
}