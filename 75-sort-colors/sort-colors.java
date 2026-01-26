class Solution {
    public void sortColors(int[] arr){
        //Consider the whole array to be unsorted 
        //[0 to low-1] -> 0 Left Extreme
        //low -> pointer points to stating
        int low = 0;
        //[low to mid-1] -> 1
        //mid -> pointer points to starting 
        int mid = 0;
        //[high+1 to n-1] -> 2 Right Extreme
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                //swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                //swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}