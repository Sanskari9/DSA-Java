public class InsertNewNode {
    static class Node<Integer>{
        int data;
        Node<Integer> next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node<Integer> createLinkedList(){
        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

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
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        int currPos = 0;
        Node<Integer> newNode = new Node<Integer>(data);
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        while(temp!=null && currPos<(pos-1)){
            temp = temp.next;
            currPos++;
        }
        if(temp==null){
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void main(String [] args){
    Node<Integer> head = createLinkedList();
    print(head);
    Node<Integer> newLL =insert(head, 2, 50);
    print(newLL);
    }
}
