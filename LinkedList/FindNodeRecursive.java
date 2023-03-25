class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class FindNodeRecursive {
    public static int findNodeR(Node head, int n){
        if(head == null){
            return -1;
        }
        if(head.data == n){
            return 0;
        }

        int smallAns = findNodeR(head.next, n);
        if(smallAns == -1){
            return -1;
        }
        return smallAns + 1;
    }
    public static void main(String [] args){
        Node head = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(22);
        Node n4 = new Node(67);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(findNodeR(head, 22));
    }
}
