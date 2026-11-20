class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String result = s + s;
        if(result.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}