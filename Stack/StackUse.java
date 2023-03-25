public class StackUse {
    public static void main(String [] args) throws StackEmptyException, StackFullException{
        // StackUsingArray Stack = new StackUsingArray(2);
        StackUsingLL<Integer> Stack = new StackUsingLL<>();
        int arr [] = {5,6,7,8,9};
        for(int i = 0; i<arr.length;i++){
            Stack.push(arr[i]);
        }

        while(!Stack.isEmpty()){
            System.out.println(Stack.pop());
        }
        // Stack.push(10);
        // Stack.push(20);
        // System.out.println(Stack.size());
        // System.out.println(Stack.top());
        // Stack.pop();
        // System.out.println(Stack.top());
        // System.out.println(Stack.size());
        // System.out.println(Stack.isEmpty());



    }
}
