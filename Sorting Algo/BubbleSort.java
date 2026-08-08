class BubbleSort {
    static void bubbleSort(int[] arr){
        int temp; // temp variable for swaping 
        int n = arr.length;// length of the array
        Boolean swaped;// bool variable for check if the itrationswaped any element
        
        //loop run n -1 bcuz we check the next element in every itration
        //if we not put n - 1 array index will go out of boundery
        for(int i=0;i<n-1;i++){
            swaped = false;//set the swaped to flase evry single itration
            for(int j=0;j < n-i-1;j++){//this loop check the next element
                if(arr[j] > arr[j +1]){//if the next element is small than this swaped the elements
                    //swap the two element j and j +1
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //after swaping swaped is set to true
                    swaped = true;
                }
            }
            //if there is no swaped do on this itration then we consider the array is fully sorted so break the loop and exit
            if(!swaped){
                break;
            }
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
        bubbleSort(arr);//Sort array
        printArray(arr);//print array after sorting
    }
}
