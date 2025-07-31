public class RecursionFriendsPair {
    public static int pair(int n)
    {
        if (n==1)
        {
            return 1;
        }
        if (n==2)
        {
            return 2;
        }
        //single
        int single = pair(n-1);
        int pairs = (n-1) * pair(n-2); //(n-1)= a,b,c,d,e,f,g  (n-2)=(a,b) (a,c) (a,d).... (b,c) (b,d).....
        int totlways = single + pairs;
        return totlways;
    }
    public static void main(String[] args) {
        int no_of_people = 6;
        System.out.println(pair(no_of_people));
    }
    
}
