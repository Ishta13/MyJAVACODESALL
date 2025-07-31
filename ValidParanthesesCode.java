import java.util.*;
public class ValidParanthesesCode {
    public static boolean isvalidParantheses(String str)
    {
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            ////////opening
            if(ch =='('|| ch =='{'|| ch=='[')
            {
                s.push(ch);
            }
            else{
                ///////closing
                if(s.isEmpty())
                {
                    return false;
                }
                else{
                    if(s.peek()=='('&& ch==')'|| s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']')
                    {
                       s.pop();  //////here pop and at end empty there return true
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
            if(s.isEmpty())
            {
                return true;
            }
            else
            {
            return false;
            }
        
    }
    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(isvalidParantheses(str));
    }
}
