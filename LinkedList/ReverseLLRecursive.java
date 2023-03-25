import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class ReverseLLRecursive {
    public static Node takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null, tail = null;
        while(data!=-1){
            Node currNode = new Node(data);
            if(head == null){
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
    public static Node reverseR(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node smallHead = reverseR(head.next);
        head.next.next =head;
        head.next = null;
        return smallHead;
    }
    public static void printR(Node head) {
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        printR(head.next); 
    }
    public static void main(String [] args){
        Node head = takeInput();
        printR(reverseR(head));
    }
}
