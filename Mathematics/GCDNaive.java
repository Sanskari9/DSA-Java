public class GCDNaive {
    static int gcd(int a, int b){
        int res = Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
                {
                    break;
                }
            }
            res--;
        }return res;
    }
    public static void main(String [] args){
        int a = 4, b = 6;
        int ans = gcd(a, b);
        System.out.println(ans);
    }
}
