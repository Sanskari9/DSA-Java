public class QueueUse {
    public static void main(String [] args) throws QueueEmptyException{
        // QueueUsingArray queue = new QueueUsingArray(3);
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        int arr [] = {1,2,3,4,5,6,7,8};
        for (int i = 0; i<arr.length;i++) {
            queue.enqueue(arr[i]);
        }

       while(!queue.isEmpty()){
        System.out.println(queue.dequeue());
       }
    }
}
