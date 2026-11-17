class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        int left = 0;
        int right = word.length-1;
        while(left < right){
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", word);
    }
}