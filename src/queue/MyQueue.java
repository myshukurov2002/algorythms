package queue;

import java.util.NoSuchElementException;
import java.util.Stack;
    class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            // Move elements from stack1 to stack2 to preserve order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            // Move elements back to stack1
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public int pop() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return stack1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return stack1.peek();
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
        public boolean isEmpty() {
            return stack1.isEmpty();
        }
}
