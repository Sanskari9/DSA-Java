public class ReverseLL {
    static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
        }
    }
    // public static void reverseLL(Node<Integer> root){
    //     if(root == null){
    //         return;
    //     }
    //     reverseLL(root.next);
    //     System.out.print(root.data+" ");
    // }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> reverseList(Node<Integer> head){
        Node<Integer> prev , next, curr;
        prev = null;
        next = null;
        curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String [] args){
       Node<Integer> head = new Node<>(10); 
       Node<Integer> n2 = new Node<>(20); 
       Node<Integer> n3 = new Node<>(30); 
       head.next = n2;
       n2.next = n3;
        // reverseLL(head);
        print(head);
        Node<Integer> newLL = reverseList(head);
        print(newLL);
    }
}
