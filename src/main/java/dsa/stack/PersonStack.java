package dsa.stack;

public class PersonStack {
    private Person[] stack;
    private int top;
    private int size;

    public PersonStack() {
        top = -1;
        this.size = 50;
        stack = new Person[this.size];
    }

    public PersonStack(int size) {
        top = -1;
        this.size = size;
        stack = new Person[this.size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public boolean push(Person element) {
        if (!isFull()) {
            top++;
            stack[top] = element;
            return true;
        } else return false;
    }

    public Person pop() {
        return stack[top--];

    }
}
