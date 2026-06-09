class Solution {
    public int fib(int n) {
        // Checking base case
        if(n <= 1){
            return n;
        }
        //Storing values
        int[] map = new int[n+1];
        map[0] = 0;
        map[1] = 1;
        for(int i = 2; i <= n; i++){
            map[i] = map[i-1]+map[i-2];
        }
        return map[n];


        
    }
}