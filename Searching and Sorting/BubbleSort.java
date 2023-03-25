public class BubbleSort {
    public static void bubbleSort(int input []){
        for(int i=0; i<input.length-1;i++){
            for(int j=0; j<input.length-i-1;j++){
                if(input[j]> input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    } 
    public static void main(String [] args){
        int arr [] = {1,8,6,9,2,4};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
