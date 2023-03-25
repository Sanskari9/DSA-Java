class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class MergeSortLL {
    public static Node findmid(Node head){
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    public static Node merge(Node head1, Node head2){
        if(head1 == null){
            return head1;
        }

        if(head2 == null){
            return head2;
        }
        Node newHead = null, newTail = null;
        if(head1.data<head2.data){
            newHead = head1;
            newTail = head1;
            head1 = head1.next;
        }else{
            newHead = head2;
            newTail = head2;
            head2 = head2.next;
        }
        while(head1!=null && head2!=null){
                if(head1.data<head2.data){
                    newTail.next = head1;
                    newTail = newTail.next;
                    head1 = head1.next;
                }else{
                    newTail.next = head2;
                    newTail = newTail.next;
                    head2 = head1.next;
                }
        }

        if(head1!=null){
            newTail.next = head1;
         }

         if(head2!=null){
            newTail.next = head2;
         }
         return newHead;
       }
       public static Node mergeSort(Node head){
        if(head == null|| head.next == null){
            return head;
        }
        Node mid = findmid(head);
        Node half1 = head;
        Node half2 = mid.next;
        mid.next = null;
        half1 = mergeSort(half1);
        half2 = mergeSort(half2);
        Node finalHead = merge(half1, half2);
        return finalHead;
       }
     
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        Node head = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(20);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node ans = mergeSort(head);
        print(ans);
    }
}
