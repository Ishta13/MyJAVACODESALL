import java.util.*;
public class arraystart {
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // one method to update array
    public static void arrayupdate(int numbers[]){
        numbers[0]= 1000;
        numbers[1]= 2000;
        numbers[2]= 3000;
        System.out.println("no 1 is: "+numbers[0]);
        numbers[1]=1234;
        System.out.println("2nd no is"+numbers[1]);
        numbers[2]=numbers[2]+1;
        System.out.println("3rd no is"+numbers[2]);
    }
    public static void arrayinput(int arr[]){
        /*Scanner news = new Scanner(System.in);
        System.out.println("ENter elements: ");
        for(int i=0;i<arr.length;i++)                       // if taking input here take using scanner 
        {
            arr[i]= news.nextInt();                           // same as cin>>arr[i]      same (arr[i]= sc.nextInt())
        }*/
        System.out.println("Following are elements: ");      
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int numbers[] = new int[3];                     //or int[] numbers= new int[3];
        arrayupdate(numbers);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("ENter elements: ");     // eitheer take elements here or in another func it's same
        for(int i=0;i<num.length;i++)
        {
            num[i]= sc.nextInt();
        }
        arrayinput(num);

        
        



    }
    
}
