class InsertionSort{
    static void insertionSort(int[] arr){
        int n = arr.length;//list size
        for(int i=0;i<n;i++){//loop runn for n time i start with the second element
            int key = arr[i];// key store the element which is going to change the position to it sorted position
            int j = i - 1;//previous element of i
            while(j>=0 && arr[j] > key){//check two things j is not going less than zero and key value is smaller than current j element
                arr[j+1] = arr[j]; // move the element by one step to create space for the key
                j--;//decrease by one till the -1 or j elemt smaller than key
            }
            arr[j+1] = key;// after finishing the loop the key is placed in the sorted position
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