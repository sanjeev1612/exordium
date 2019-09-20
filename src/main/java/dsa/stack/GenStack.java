package dsa.stack;

public class GenStack {
    private Object[] stack;
    private int top;
    private int size;

    public GenStack() {
        top = -1;
        this.size = 50;
        stack = new Object[this.size];
    }

    public GenStack(int size) {
        top = -1;
        this.size = size;
        stack = new Object[this.size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public boolean push(Object element) {
        if (!isFull()) {
            top++;
            stack[top] = element;
            return true;
        } else return false;
    }

    public Object pop() {
        return stack[top--];

    }
}

