public class StackUsingArray{
    private int data[];
    private int topIndex;

    public StackUsingArray(){
        data = new int [10];
        topIndex = -1;
    }
    public StackUsingArray(int size){
        data = new int [size];
        topIndex = -1;
    }
    public int size(){
        return topIndex+1;
    }

    public boolean isEmpty(){
        return topIndex== -1;
    }

    public void push(int elem){
        // if Stack is full
        if(topIndex == data.length -1){
            doubleCapacity();
        }
            data[++topIndex] = elem;
        
    }
    private void doubleCapacity(){
        System.out.println("Double Capacity");
        int temp [] = data;
        data = new int [2*temp.length];
        for(int i = 0; i<temp.length;i++){
            data[i] = temp[i];
        }
    }

    public int top() throws StackEmptyException{
        if(topIndex == -1){
            throw new StackEmptyException();
        }
            return data[topIndex];
       
    }
    public int pop() throws StackEmptyException{
        
            if(topIndex == -1){
                throw new StackEmptyException();
            }
        
            int temp = data[topIndex];
            topIndex--;
            return temp;
        
    }
}