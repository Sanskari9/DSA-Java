public class LeftRotatebyD {
    static  void reverse (int arr[],int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void leftRotatebyD(int arr[],int n, int d){
        reverse(arr,0,d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int d=3;
        leftRotatebyD(arr, n, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
}
