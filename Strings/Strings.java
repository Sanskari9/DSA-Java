public class Strings{
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String [] args){
        String str1 = "coding";
        String str2 = " is fun";
        String str3 = "aoding";
        // System.out.println(str1 + str2);
        // System.out.println(str1.concat(str2));
        // System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
        // System.out.println(str.charAt(3));
        // System.out.println(str.length());
        // System.out.println(str.substring(3, 6));
        // System.out.println(str.contains("cdf"));
        // print(str);

    }
}