public class BacktrackingPermutationStrings {
    public static void permutation(String str, String ans,int i)
    {
        if (str.length()==0) //if string is empty then //using i==str.length() giving wrong ans
        {
            System.out.println(ans);
            return;
        }
        for( i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de"
            String newStr = str.substring(0, i)+ str.substring(i+1);   //str.length-1 nhi lena end me vrna it'll create error
            permutation(newStr, ans+curr,i+1);  //appending diff permutations to ans
        }
    }
    public static void main(String[] args) {
        String ans="";
        String str= "abe";
        System.out.println("diff permutations are: ");
        permutation(str, ans,0);
    }
    
}
