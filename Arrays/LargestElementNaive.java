public class LargestElementNaive {
    public static int getLargest(int arr []){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr [] = {4,6,8,3,12,9,15};
        int idx = getLargest(arr);
        System.out.println(arr[idx]);
    }
}
