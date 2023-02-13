public class PermutationString {
    public static void findPer(String str,String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1,str.length());// we can also write i+1 only bydefault go length-1
            findPer(newStr, ans+curr);            
         }
    }
    public static void main(String [] arsg) {
        String str = "abcde";
        findPer(str, "");
         
    }    
}
