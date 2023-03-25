public class LargestElementEff {
    public static int getLargest(int arr[]){
        int res =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {3,5,7,12,5,25,11,16,};
        int idx = getLargest(arr);
        System.out.println(idx);
    }
}
