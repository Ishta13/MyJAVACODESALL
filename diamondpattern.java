public class diamondpattern {
    public static void diamond(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
// printing j instead of stars



        public static void dia(int n){
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    
            for(int i=n;i>=1;i--)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        diamond(6);
        dia(4);
    }
}
