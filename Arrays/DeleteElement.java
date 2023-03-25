public class DeleteElement {
    public static int delete(int arr[],int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x)
            break;
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]= arr[j+1];
        }
        
        return (n-1);
    }
    public static void main(String [] args){
        int arr[] ={2,4,5,6,7,8};
        int n = arr.length;
        int ans = delete(arr, n, 8);
        System.out.println(ans);
        for(int i=0;i<ans;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
