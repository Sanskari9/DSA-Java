import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[] , int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== val){
                return i;
            }
        }
        return -1;
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        System.out.println("Enter the value");
        int x = sc.nextInt();
        int index = linearSearch(arr,x);
        System.out.println("The value found at index: "+ index);
    }
}
