import java.util.Scanner;
public class ArrangeNum {
    public static void arrange(int arr[], int n){
        int left =0;
        int right =n-1;
        int counter = 1;
        while(left<=right){
            if(counter % 2 == 1){
                arr[left] = counter;
                left++;
                counter++;
            }
            else{
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     int counter = 1 ;
     int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = counter;
            counter++;
        }
        arrange(arr,n);
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
