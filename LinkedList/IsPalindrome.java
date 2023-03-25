import java.util.Scanner;

class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class IsPalindrome {
    // public static Node<Integer> takeInput(){
    //     Scanner sc =new Scanner(System.in);
    //     int data = sc.nextInt();
    //     Node<Integer> head = null, tail =null;
    //     while(data!=-1){
    //         Node<Integer> currNode = new Node<Integer>(data);
    //         if(head==null){
    //             head = currNode;
    //             tail = currNode;
    //         }else{
    //             tail.next = currNode;
    //             tail = currNode;
    //         }
    //         data = sc.nextInt();
    //     }
    //     return head;
    // }

    public static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean IsPalindrome(Node head){
        if(head ==null || head.next == null){
            return true;
        }
        Node fast =head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node secondHead = slow.next;
        slow.next = null;
        Node second = reverseLL(secondHead);
        
        //Compare two sublist
        Node firstSubList = second;
        Node secondSubList = head;
        while(firstSubList!=null){
            if(firstSubList.data != secondSubList.data){
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }
        // rejoin
        firstSubList = head;
        secondSubList =reverseLL(second);
        while(firstSubList.next != null){
            firstSubList = firstSubList.next;
        }
        firstSubList.next = secondSubList;

        return true;
    }

    public static void main(String [] args){
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(1);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        boolean ans = IsPalindrome(head);
        System.out.println(ans);
    }
}
