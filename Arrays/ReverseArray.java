public class ReverseArray {
    public static void reverse(int arr[]){
        int low =0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
         }
    }
    public static void main(String [] args){
        int arr[] ={5,7,8,9,3};
        reverse(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
