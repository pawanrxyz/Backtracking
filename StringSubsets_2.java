public class StringSubsets_2 {
    public static void subSets(String str, String ans,int idx) {
        if(idx == str.length()) {
            if(ans.length()==0) {

                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }        
        //yes
        subSets(str, ans+str.charAt(idx), idx+1);
        //No
        subSets(str, ans, idx+1);
    }
    public static void main(String args[]) {
        String str = "abc";
        subSets(str, "", 0);
    }
    
}
