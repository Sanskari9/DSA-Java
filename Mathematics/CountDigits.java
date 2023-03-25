import java.util.Scanner;
class CountDigits{
    static int count(int n){
        int res=0;
        while(n>0){
            n = n/10;
            res++;
        }
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      int ans = count(n);
      System.out.println(ans); 
    }
}