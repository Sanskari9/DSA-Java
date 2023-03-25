public class DeleteNode {
    static class Node<Integer>{
        int data;
        Node<Integer> next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node<Integer> createLL(){
        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
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
    public static Node<Integer> delete(Node<Integer> head, int pos){
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        int count =0;
        Node<Integer> currhead = head;
        while(currhead!=null && count<(pos-1)){
            currhead = currhead.next;
            count++;
        }
        if(currhead == null || currhead.next == null){
            return head;
        }
        currhead.next = currhead.next.next;
        return head;
    }
    public static void main(String [] args){
        Node<Integer> head = createLL();
        print(head);
        Node<Integer> newLL = delete(head, 0);
        print(newLL);
    }
}
