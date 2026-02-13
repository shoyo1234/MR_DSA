class Solution {
    public boolean isValid(String s) {
        //Stack to store open parantheses
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            //If closing Bracket
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;

            }
        }
        //If all the brackets batch and stack is empty return true
        return stack.isEmpty();
    }
}