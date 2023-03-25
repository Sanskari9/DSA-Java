public class IncreementArray {

    public static void increementArray(int input[]){
        for(int i=0;i<input.length;i++){
            input[i]++;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args) {
        int arr[] = {1,2,3,4,5};
        increementArray(arr);
        print(arr);
    }
}
