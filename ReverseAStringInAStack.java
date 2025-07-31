import java.util.*;
public class ReverseAStringInAStack {
    public static String reverseString(String str)
    {
        Stack <Character> ch = new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            ch.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!ch.isEmpty())
        {
            char curr= ch.pop();    /////to reverse take pop elemnt and then append
            result.append(curr);
        }
        return result.toString();  

    }
    public static void main(String[] args) {
        String str="abc";
        String result = reverseString(str);
        System.out.println(result);

    }
}
