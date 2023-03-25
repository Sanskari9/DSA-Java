import java.util.Scanner;

public class TakeInputFromUser {
    static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }
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
                // Node<Integer> tail = head;
                // while(tail.next!=null){
                //     tail = tail.next;
                // }
                tail.next = currNode;
                tail = currNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String [] args){
        Node<Integer> head = takeInput();
        print(head);
    }
}
