class MyStack {

    // Using  queue to simulate stack behaviour
    private Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    // Push element onto stack
    public void push(int x) {

        // Step 1: add element normally to queue
        queue.add(x);

        // Step 2: move all previous elements behind the new element
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
    }
    
    // Remove and return the top element
    public int pop() {
        return queue.remove();
    }
    
    // Return top element without removing it
    public int top() {
        return queue.peek();
    }
    
    // Check whether stack is empty
    public boolean empty() {
        return queue.isEmpty();
    }
}