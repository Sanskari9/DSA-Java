public class IsSortedEff {
    public static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++)
        if(arr[i]<arr[i-1]){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        int [] arr = {3,4,5,6,7};
        System.out.println(isSorted(arr));
    }
}
