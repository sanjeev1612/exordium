package dsa.stack;

public class PersonStackTestor {
    public static void main(String[] args) {
        Person p1=new Person("Sanjeev" ,"21");
        Person p2=new Person("Ranjan" ,"22");
        GenStack stack = new GenStack();
        stack.push(p1);
        stack.push(p2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
