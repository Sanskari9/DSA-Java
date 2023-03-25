public class AllZeroToEnd {
    public static void moveToEnd(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    public static void main(String [] args){
            int arr[] = {10,5,0,0,8,0,9,0};
            moveToEnd(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
}
