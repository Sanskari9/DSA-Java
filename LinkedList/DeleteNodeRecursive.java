import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class DeleteNodeRecursive {
    public static Node takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null, tail = null;
        while(data!=-1){
            Node currNode = new Node(data);
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
    public static Node DeleteR(Node head, int pos){
        if(head == null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next = DeleteR(head.next, pos-1);
        return head;
    }
    public static void print(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static void main(String [] args){
        Node head = takeInput();
        Node ans = DeleteR(head, 2);
        print(ans);
    }
}
