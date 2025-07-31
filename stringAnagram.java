import java.util.Arrays;

public class stringAnagram {
    public static void main(String[] args) {
        String str="anam";
        String st="mana";
        char ch1[] = str.toCharArray();
        char ch2[] = st.toCharArray();
        if (ch1.length != ch2.length)
        {
            System.out.println("not anagram");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i=0;i<ch1.length;i++)
        {
                if (ch1[i]!=ch2[i])
                {
                    System.out.println("not anagram");
                    return;
                }
        }
        System.out.println("anagram");
    }
    
}
