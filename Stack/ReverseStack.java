import java.util.Stack;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra){
        if(input.size()<=1){
            return;
        }
        int LastElement = input.pop();

        reverseStack(input, extra);

        while(!input.isEmpty()){
            int top = input.pop();
            extra.push(top);
        }

        input.push(LastElement);

        while(!extra.isEmpty()){
            int top = extra.pop();
            input.push(top);
        }
    }
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        reverseStack(stack, extra);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
