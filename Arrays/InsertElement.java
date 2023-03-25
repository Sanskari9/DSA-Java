public class InsertElement {
    public static int insert(int arr[], int n, int x, int cap, int pos){
        if(n==cap){
            return n;
        }
        int idx = pos -1;
        for(int i = n-1;i>=idx;i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return n+1;
    }
    public static void main(String [] args){
        int arr[] = new int [5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 2;
        int N = 3;
        int cap = arr.length;
        
        int ans = insert(arr, N, 4, cap, 2);
        System.out.println(ans);

        int ans1 = insert(arr, ans, 4, cap, 1);
        System.out.println(ans1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

       
    }
}
