class Node{
    int data ;
    Node next;
    Node(int data ){
        this.data = data;
    }
}
public class MergeTwoSortedList {
    public static Node mergeTwoSortedList(Node head1, Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        Node newHead = null, newTail = null;
        if(head1.data < head2.data){
            newHead = head1;
            newTail = head1;
            head1 = head1.next;
        }else{
            newHead = head2;
            newTail = head2;
            head2 = head2.next;
        }
        while(head1!= null && head2!=null ){
            if(head1.data<head2.data){
                newTail.next = head1;
                newTail = newTail.next;
                head1 = head1.next;
            }else{
                newTail.next = head2;
                newTail = newTail.next;
                head2 = head2.next;
            }
        }

        if(head1!= null){
            newTail.next = head1;
        }

        if(head2!=null){
            newTail.next = head2;
        }
        return newHead;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node head1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(50);
        head1.next = n2;
        n2.next = n3;

        Node head2 = new Node(20);
        Node m2 = new Node(40);
        Node m3 = new Node(60);
        Node m4 = new Node(70);
        Node m5 = new Node(80);
        head2.next = m2;
        n2.next = m3;
        m3.next = m4;
        m4.next = m5;

        Node ans = mergeTwoSortedList(head1, head2);
        print(ans);
    }
}
