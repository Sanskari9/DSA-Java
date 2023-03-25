public class SortZeroOne {
    public static void sortZeroOne(int arr[] ){
      int nextZero=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            int temp = arr[nextZero];
            arr[nextZero] = arr[i];
            arr[i] = temp;
            nextZero++;
        }
      }

    }
    public static void main(String [] args){
        int arr [] = {0,1,1,0,0,0,1,1,1,1,0,0};

        sortZeroOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
