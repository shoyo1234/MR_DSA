class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Stores product of all the elements before index i
        int left[] = new int[nums.length];
        //Nothing to the left of first element
        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        // Stores product of all the elements after index i
        int right[] = new int[nums.length];
        //Nothing to the right of the last element
        right[nums.length-1] = 1;
        for(int i = nums.length-2; i > -1; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = left[i]*right[i];
        }
        return nums;
    }
}