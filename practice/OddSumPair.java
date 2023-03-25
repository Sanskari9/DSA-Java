import java.util.*;
public class OddSumPair {
    public static String oddSumPair(int x, int y, int z){
        if(x%2==0 && y%2==0 && z%2==0){
            return "NO";
        }else if(x%2!=0 && y%2!=0 && z%2!=0){
            return "NO";
            }else{
                return "YES";
            }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ans = oddSumPair(a, b, c);
        System.out.println(ans);
    }
}
