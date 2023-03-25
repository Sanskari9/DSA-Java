public class FindUniqueNum {
    public static int findUniqueSum(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==arr.length){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr [] ={3,4,6,7,6,4,3};
        System.out.println(findUniqueSum(arr));
    } 
    
}
