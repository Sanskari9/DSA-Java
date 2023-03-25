public class CreateLL{
//    static class Node{
//         int data;
//         Node next;
//         Node (int data){
//             this.data = data;
//             next = null;
//         }
static class Node<T>{
    T data ;
    Node<T> next ;
    Node(T data){
        this.data = data;
        next = null;
    }
}
public static Node<Integer> createLinkedList(){
    Node<Integer> n1 = new Node<Integer>(10);
    Node<Integer> n2 = new Node<Integer>(20);
    Node<Integer> n3 = new Node<Integer>(30);
    Node<Integer> n4 = new Node<Integer>(40);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    return n1;
}
public static void print(Node<Integer> head){
    Node<Integer> temp = head;
    while(temp!=null){
        System.out.print(temp.data +" ");
        temp = temp.next;
    }
    System.out.println();
    // System.out.println(head.data);
    // System.out.println(temp);
}
public static void increment(Node<Integer> head){
    Node <Integer> temp = head;
    while(temp!=null){
        temp.data++;
        temp = temp.next;
    }
}
    
    public static void main(String [] args){
        // Node n1 = new Node(20);
        // System.out.println(n1);
        // System.out.println(n1.next);
        // System.out.println(n1.data);
        Node<Integer> head = createLinkedList();
        increment(head);
        print(head);
    }
}