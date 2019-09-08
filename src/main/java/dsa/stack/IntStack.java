package dsa.stack;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    public IntStack() {
        top = -1;
        this.size = 50;
        stack = new int[this.size];
    }

    public IntStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public boolean push(int element) {
        if (!isFull()) {
            top++;
            stack[top] = element;
            return true;
        } else return false;
    }

    public int pop() {
            return stack[top--];

    }
}
