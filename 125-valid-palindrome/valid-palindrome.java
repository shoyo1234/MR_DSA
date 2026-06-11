class Solution {
    public boolean isPalindrome(String s) {

        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] string_arr = result.toCharArray();

        boolean isPalindrome = true;
        int left = 0;
        int right = string_arr.length - 1;

        while(left < right){
            if(string_arr[left] != string_arr[right]){
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            return true;
        }else{
            return false;
        }
        
    }
}