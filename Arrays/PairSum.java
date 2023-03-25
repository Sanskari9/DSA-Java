public class PairSum {
    public static void numPairs(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]== sum){
                  if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                  }
                  else{
                    System.out.println(arr[j]+" "+arr[i]);
                  }  
                }
            }
        }
    }

    public static int countPairs(int arr[],int sum){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]== sum){
                  count +=1;
                }
            }
        }
        return count;
    }

    public static void main(String [] args){
        int arr [] = {2,1,5,3,2,4,7,1};
        int sum =7;
        int pair = countPairs(arr, sum);
        System.out.println(pair);
        numPairs(arr, sum);
    }
}
