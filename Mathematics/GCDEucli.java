public class GCDEucli {
    static int gcd(int a, int b){
        while(a!=b)
        {
            if(a>b){
                a=a-b;
            }
            else
            b = b-a;
        }
        return a;
    }
    public static void main(String [] args){
        int a = 100, b= 200;
        int ans = gcd(a, b);
        System.out.println(ans);
    }
}
