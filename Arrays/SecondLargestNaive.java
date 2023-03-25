public class SecondLargestNaive {
    public static int getLargest (int arr[]){
        int largest =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                largest =i;
            }
        }
        return largest;
    }
    public static int secondLargest(int arr[]){
        int largest = getLargest(arr);
        int res = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[largest]){
                if(res == -1){
                    res = i;
                }else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {5,20,12,20,10};
        int idx = secondLargest(arr);
        System.out.println("index of Second largest Element: " + idx + " and element : "+arr[idx]);

    }
}
