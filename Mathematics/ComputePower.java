public class ComputePower {
    static int power(int x, int n){
        int res =1;
        for(int i=0;i<n;i++){
            res=res*x;
        }
        return res;
    }
    public static void main(String [] args){
        int ans = power(2, 3);
        System.out.println(ans);
    }
}
