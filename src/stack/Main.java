package stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(13);

//        System.out.println(stack.isEmpty());
//        stack.print();
        System.out.println(stack.pop());
        stack.pop();
        stack.print();


    }
}
