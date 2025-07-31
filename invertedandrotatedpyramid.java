public class invertedandrotatedpyramid {
    public static void invertedandrotatedtriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            { 
                System.out.print(" ");

            }

                for(int k=1;k<=i;k++)             // can use for(int j=1;j<=i;j++) sirf block ke andr hi vo particular int use hota toh same or diff use kr skteyy
                {
                    System.out.print("*");
                }

            System.out.println();
            
        }

    }        
        public static void main(String[] args) {
            invertedandrotatedtriangle(6);
    
           
        }
    
}
