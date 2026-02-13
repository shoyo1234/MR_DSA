class Solution {
    public int calPoints(String[] operations){

        // Stack to keep track of valid scores
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for(String op : operations){

            if(op.equals("C")){
                // Remove the last valid score
                sum  = sum - stack.pop();
            }
            else if(op.equals("D")){
                // Double the last score and add it
                int newScore = 2*stack.peek();
                stack.push(newScore);
                sum = sum + newScore;
            }
            else if(op.equals("+")){
                // Add last two scores
                int last_ele = stack.pop();
                int second_last_ele = stack.peek();
                int newScore = last_ele + second_last_ele;

                // Push back the removed score and the new one
                stack.push(last_ele);
                stack.push(newScore);
                sum = sum + newScore;
            }
            else{
                // Regular number just add to stack
                int new_ele = Integer.parseInt(op);
                stack.push(new_ele);
                sum = sum + new_ele;
            }
        }
        return sum;
    }
}
