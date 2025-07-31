public class largestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","strawberry","lion"}; //kind of array
        String largest = fruits[0];                //from grp of string start from index one to iterate and find diff
        for(int i=1;i<fruits.length;i++)           // using array length formula
        {
            if (largest.compareTo(fruits[i])<0)      
            {
                largest = fruits[i];
            }
        }
        System.out.println("hence largest string is: "+largest);
    }
    
}
