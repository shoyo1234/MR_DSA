class Solution {
    public int maxSubArray(int[] nums) {
        // Store the sum of the current subarray
        int sum = 0;
        // Initialize max with very less value as "-" is involved
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            // Update current max if sum is greater 
            if(sum > max){
                max = sum;
            }// Discard running sum if negative 
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
        
    }
}