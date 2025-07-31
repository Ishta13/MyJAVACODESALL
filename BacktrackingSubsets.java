public class BacktrackingSubsets {
    public static void sub(String str,int i,String ans)
    {
        if(i==str.length()|| str.length()==0) //base case jb poori str ka subset nikl jaaye including empty set

        // str.length()==0 not necessary
        {
            System.out.println(ans);
            return;
        }
        sub(str, i+1,ans + str.charAt(i)); //yes add string to ans
        sub(str,i+1,ans); //no don't add  string to ans 
    }
    public static void main(String[] args) {
        String ans = "";
        String and = "abcd";
        System.out.println("these are the subsets: ");
        sub(and, 0, ans);
    }
    
}
