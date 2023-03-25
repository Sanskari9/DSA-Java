public class SelectionSort {
    public static void selectionSort(int input[]){
        for(int i=0;i<input.length-1;i++){
            int min = input[i];
            int minIndex = i;
            for(int j=i+1;j<input.length;j++){
                if(input[j]<min){
                    min = input[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                input[minIndex]= input[i];
                input[i] = min;
            }
        }
    }
    public static void main(String [] args){
    int arr[] = {9,6,1,4,6};
    selectionSort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
