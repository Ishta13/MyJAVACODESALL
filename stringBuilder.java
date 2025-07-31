public class stringBuilder {
    public static void sB(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch+" "+"\n");         //can be used as string concatenate
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String sl = "all";
        sB(sl);

    }
    
}
