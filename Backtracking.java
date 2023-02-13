public class Backtracking {
    public static void printString(String str,String newStr,int idx) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        printString(str, newStr+currChar, idx+1);
        printString(str, newStr, idx+1);
    }
    public static void main(String args[]) {
        String str = "abc";

        printString(str, "", 0);
    }
}