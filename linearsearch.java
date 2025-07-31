public class linearsearch {
    public static int linear(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {12,14,15,18,1};
        int key=8;
       
        int res= linear( num,key);
        if(res!=-1){
            System.out.println("key found at: "+res);

        }
        else{
            System.out.println(key+" not found");
        }

    }
    
}