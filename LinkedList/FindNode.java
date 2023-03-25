public class FindNode {
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
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int findNode(Node<Integer> head, int n){
        if(head==null){
            return -1;
        }
        int i=0;
        while(head!=null){
            if(head.data==n){
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;
    }
    public static void main(String [] args){
        Node<Integer> head = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        print(head);
        int ans = findNode(head, 30);
        System.out.println(ans);


    }
}
