public class AppendLastNToFirst {
    static class Node<Integer>{
        int data;
        Node<Integer> next;
        Node(int data){
            this.data = data;
        }
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        } 
        System.out.println();
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        if(n==0 || head == null){
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> intialhead = head;
        for(int i =0;i<n;i++){
            fast = fast.next ;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node <Integer> temp = slow.next;
        slow.next = null;
        fast.next = intialhead;
        head = temp;
        return head;
    }
    public static void main(String [] args){
        Node<Integer> head = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        print(head);
        Node<Integer> newLL = appendLastNToFirst(head, 3);
        print(newLL);
    }
}
