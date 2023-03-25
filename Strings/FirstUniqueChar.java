public class FirstUniqueChar {
        public static int firstUniqChar(String s) {
           int frequency[] = new int [26];
            for(int i=0;i<s.length();i++){
                frequency[s.charAt(i)-'a']++;
            }
            for(int i=0;i<s.length();i++){
                if(frequency[s.charAt(i)-'a']==1){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String [] args){
            String s = "aaabcc";
            System.out.println(firstUniqChar(s));
        }
    }

