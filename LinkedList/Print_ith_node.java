class Print_ith_node {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void printIthNode(Node head,int i){
        int pos = 0;
        Node temp = head;
        while(temp!=null && pos<i){
            pos++;
            temp = temp.next;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }
    }
    public static void main(String [] args){
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        head.next =n2;
        n2.next = n3;

        printIthNode(head, 2);

    }
}
