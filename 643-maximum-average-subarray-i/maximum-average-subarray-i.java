class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;
        // Sum of first k elements (window)
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        int maxSum = sum;
        // Loop from second element -0th element add kth element
        for(int i = k; i < n; i++){
            sum = sum + nums[i] - nums[i-k];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return (double) maxSum/k;

        
    }
}