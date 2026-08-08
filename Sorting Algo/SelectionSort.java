class SelectionSort{

    static void selectionSort(int[] arr){
        int n = arr.length; //get the length of the array without -1
        for(int i=0;i<n;i++){// loop run n-1 time
            int min = i;// declaring the i as min
            for(int j=i+1;j<n;j++){//loop start from i+1,to compare the next all following element with the element in i
                
                //checking if the (element in j) is < (element int min)
                //sort in ascending order (<)
                //sort in decending order (>)
                if(arr[j] < arr[min]){
                    min = j; // set the  min as j
                }
            }
            //swaping min and i
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    //To print the arr
    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    //main function
    public static void main(String[] args){
        int[] arr = {64,24,25,12,11}; // input array variable declaration
        printArray(arr); // printing the array before sort
        selectionSort(arr);// Sorting the Array
        printArray(arr);//print the array after sort
    }
}
