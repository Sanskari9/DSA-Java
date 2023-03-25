import java.util.Stack;
public class MinimumBracketsTravesal{
    public static int countBracketReverse(String input){
        int len = input.length();
         if(len == 0){
            return 0;
         }
         if(len%2!=0){
            return -1;
         }
         Stack<Character> stack = new Stack<>();
         for(int i=0;i<len;i++){
            char currentChar = input.charAt(i);

            if(currentChar == '{'){
                stack.push(currentChar);
            }else{
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(currentChar);
                }
            }
         }

         int count = 0;
         while(!stack.isEmpty()){
            char char1 = stack.pop();
            char char2 = stack.pop();

            if(char1!= char2){
                count+=2;
            }else{
                count++;
            }
         }
         return count;
    }
    public static void main(String [] args){
        String str = "{{}{{}{{";
        System.out.println(countBracketReverse(str));
    }
}