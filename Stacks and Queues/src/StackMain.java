public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
//        stack.push(89);

//
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();

    }
}
