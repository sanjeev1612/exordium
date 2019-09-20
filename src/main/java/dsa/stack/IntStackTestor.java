package dsa.stack;

public class IntStackTestor {
    public static void main(String[] args) {
        GenStack stack = new GenStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        do {
            System.out.println(stack.pop());
        } while (stack.isEmpty());
    }
}
