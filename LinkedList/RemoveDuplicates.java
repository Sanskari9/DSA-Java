import java.util.Scanner;

public class RemoveDuplicates {
    static class Node<Integer>{
        int data;
        Node<Integer> next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node<Integer> createLL(){
        Scanner sc =new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;
        while(data!=-1){
            Node<Integer> currNode = new Node<>(data);
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
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> removeDuplicates(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> currNode = head;
        while(currNode.next!=null){
            if(currNode.data==(currNode.next.data)){
                currNode.next = currNode.next.next;
            }
            else{
                currNode = currNode.next;
            }
        }
        return head;
    }
    public static void main(String [] args){
        Node<Integer> head = createLL();
       Node<Integer> newLL= removeDuplicates(head);
        print(newLL);
    } 
}
