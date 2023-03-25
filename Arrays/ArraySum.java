import java.util.Scanner;

public class ArraySum {

    public static int arrSum(int arr[]){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans +=arr[i];
        }
        return ans;
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input [] = new int [size];
        for(int i=0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        return input;
    }
    public static void main(String [] args) {
        int arr[] = takeInput();
        int sum = arrSum(arr);
        System.out.println("The sum of Array: "+sum);
    }
}
