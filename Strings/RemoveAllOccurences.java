public class RemoveAllOccurences {
    public static String removeAllOccurrences(String str , char x){
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=x){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String [] args){
        String str = "aaabbccdekaa";
        System.out.println(removeAllOccurrences(str, 'a'));
    }
}
