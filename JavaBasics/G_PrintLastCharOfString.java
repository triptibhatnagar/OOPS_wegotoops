public class G_PrintLastCharOfString {
    public char lastChar(String s) {
        //your code goes here
        if(s.length() == 0) return '0';
        return s.charAt(s.length()-1);
    }
}