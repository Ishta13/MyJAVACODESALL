public class hollowrhombus {
    public static void hollowrhom(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }    
                for(int j=1;j<=n;j++)         //kyuki same rows aur colmns as n print krna kyuki rhombus is tilted square
                {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               }
                System.out.println();
        }
                 
    }
    public static void main(String[] args) {
        hollowrhom(8);
        
    }
    
}
