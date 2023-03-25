public class CountWord {
    public static int count(String str){
        if(str.length()==0){
            return 0;
        }

        int spaces = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                spaces++;
            }
        }
        return spaces + 1;
    }
    public static void main(String [] args){
        String str ="Coding Ninja!" ;
        int word = count(str);
        System.out.println(word);
    }
}
