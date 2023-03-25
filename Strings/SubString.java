public class SubString {
    public static void printSubString(String str){
        for(int start =0;start<str.length();start++){
            for(int end = start;end<str.length();end++){
                System.out.print(str.substring(start,end+1)+" ");
            }
        }
    }
    public static void main(String [] args){
        String str = "pqrs";
        printSubString(str);
    }
}
