import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class InsertNewNode_Recursive {
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
    public static Node insertR(Node head, int elem, int pos){
        if(head == null && pos>0){
            return head;
        }
        if(pos == 0){
            Node newNode = new Node(elem);
            newNode.next = head;
            return newNode;
        }else{
            head.next = insertR(head.next, elem, pos-1);
            return head;
        }
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
        print(insertR(head, 30, 2));
    }
}
