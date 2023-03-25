public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        int n= str.length();
        if(n==0){
            return str;
        }
        String answer = "";
        int startIndex = 0;
        while(startIndex<n){
            char uniqueChar = str.charAt(startIndex);
            int nextUniqueCharIndex = startIndex + 1;
            while(nextUniqueCharIndex<n && str.charAt(nextUniqueCharIndex) == uniqueChar ){
                nextUniqueCharIndex++;
            }
            answer += uniqueChar;
            startIndex = nextUniqueCharIndex;
        }
        return answer;
    }
    public static void main(String [] args){
        String str = "aaabbbddd";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
