public class ReversedString {
    public static String reverse(String S){
        String ReverseStr = "";
        for(int i=S.length() - 1;i>=0;i--){
            ReverseStr += S.charAt(i);
        }
        // for(int i=0;i<S.length();i++){
        //     ReverseStr = S.charAt(i) + ReverseStr;
        // }
        return ReverseStr;
    }
    public static void main(String [] args){
        String Str = "abcdef";
        String ReverseStr = reverse(Str);
        System.out.println(ReverseStr);
    }
}
