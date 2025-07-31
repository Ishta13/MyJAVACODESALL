public class PracticeRecursionStringLength {
    public static void practice(String str, int i)
    {
        int count=0;
        if(i==str.length())
        {
           return 0;
        }
        return count + practice(str, i+1);
    } 
    public static void main(String[] args) {
        String st="hello";
        practice(st, 0, 0);      /////////////////////ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
    }
}
