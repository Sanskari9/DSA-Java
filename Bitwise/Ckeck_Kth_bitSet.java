public class Ckeck_Kth_bitSet {
    //Method 1 left shift
    static void kthBitLeft(int n, int k){
        if((n & (1<<(k-1)))!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    //Method 2 Right shift
    static void rightShift(int n, int k){
        if(((n>>(k-1))&1)==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String [] args){
        int n=13, k=3;
        kthBitLeft(n, k);
        rightShift(n, k);
    }
}
