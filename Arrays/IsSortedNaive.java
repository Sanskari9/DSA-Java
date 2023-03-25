public class IsSortedNaive {
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[i])
                    return false;
        }
        return true;
    }
    public static void main(String [] args){
        int arr [] ={5,6,7,8};
        System.out.println(isSorted(arr));
    }
}
