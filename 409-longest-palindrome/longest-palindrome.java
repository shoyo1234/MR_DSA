class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int p_longest = 0;
        boolean odd = false;

        for(int count:map.values()){
            p_longest += (count/2)*2;
            if(count%2 != 0){
                odd = true;
            }
        }
        if(odd){
            p_longest++;
        }
        return p_longest;
    }
}