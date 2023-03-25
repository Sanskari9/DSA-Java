public class BinarySearch {
    // public static int binarySearch(int arr [], int elem){
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start<=end){
    //         int mid = (start+end)/2;
    //             if(elem == arr[mid]){
    //                 return mid;
    //             }else if(elem > arr[mid]){
    //                 start = mid+1;
    //             }else{
    //                 end = mid-1;
    //             }
    //     }
    //     return -1;
    // }

    public static int binarySearch(int arr[], int x ){
             
        
        int start=0;
        int mid = start;
        int end=arr.length-1;
         while(start<=end){
             mid = start+(end-start)/2;
         
             if(x<arr[mid]){
                 end = mid-1;
             }else if(x>arr[mid]) {
           start = mid+1;
             }else{
                 return mid;
             }
         }
         return -1;
     }
    public static void main(String [] args){
        int arr[] = {7,8,3,2,5,6,1};
        int index = binarySearch(arr, 6);
        System.out.println(index);
    }
}
