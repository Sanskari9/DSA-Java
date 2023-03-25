import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
    }
}
public class PrintLL_Recursive {
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data!=-1){
            Node<Integer> currNode = new Node<Integer>(data);
            if(head==null){
                head = currNode;
                tail = currNode;
            }else{
                tail.next = currNode;
                tail = currNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void printR(Node<Integer> head) {
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        printR(head.next); 
    }
    public static void main(String [] args){
        Node<Integer> head = takeInput();
        printR(head);
    } 
}
