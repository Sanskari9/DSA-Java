public class TripletsSum {
    public static void tripleSumPair(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static int countSumPair(int arr[], int sum){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == sum){
                        count +=1;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        int arr[] = {3,5,6,8,9,2,4};
        int sum = 14;
         int count = countSumPair(arr, sum);
         System.out.println(count);
         tripleSumPair(arr, sum);
    }
}
