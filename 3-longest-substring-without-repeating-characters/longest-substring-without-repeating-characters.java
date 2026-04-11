class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right;
        int maxLength = 0;
        //Set to check if dupicate exists O(1)
        HashSet<Character> set = new HashSet<>();
        for(right = 0; right<s.length(); right++){
            char element = s.charAt(right);
            //Removing from the left to make valid window and set 
            while(set.contains(element)){
                set.remove(s.charAt(left));
                left++;
            }
            //Non duplicates are added to the set
            set.add(element);
            maxLength = Math.max(right-left+1, maxLength);
        }
        //Maximum length of valid substring is returned
        return maxLength;
    }
}