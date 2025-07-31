public class countsetBits {
    public static int count(int n)//int i) ///i should always be 1
    {
        int count =0;
        while (n>0)
        {
            if ((n & 1) !=0)
            {
                count ++;
            }
            n=n>>1;  //should always store value
        }
        return count;
    }
    public static void main(String[] args) {
       System.out.println("total count is: "+count(10));
    }
    
}
