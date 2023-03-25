import java.util.Arrays;

public class ArrayInsertion {
    public static int printSameNum(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]<arr2[j]){
                    i++;
                }
                if(arr1[i]>arr2[j]){
                    j++;
                }
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        return 0;
    }
    public static void main(String [] args){
        int arr1[] = {4,3,5,7,1,2};
        int arr2[] = {2,1,6,3,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        printSameNum(arr1, arr2);
    }
}
