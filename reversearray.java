import java.util.*;
public class reversearray {
    public static void reverse(int array[]){
        int start =0,end = array.length-1;
        while(start<=end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
            }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int array[] = new int[n];
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("following are elements");
        for(int i=0;i<array.length;i++){
          System.out.println(array[i]+" ");
        }
        System.out.println("reversed array is: ");
        reverse(array);
        /*for(int i=0;i<array.length;i++){
        System.out.println(array[i]+" ");
        }*/

    }
    
    
}
