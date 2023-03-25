public class CalculateLength {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data ;
        }
    }
    public static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(-1);      
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;

    }
    public static int calculatelength(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null ||){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String [] args){
        Node head = createLinkedList();
        int length = calculatelength(head);
        System.out.println(length);
    }
}
