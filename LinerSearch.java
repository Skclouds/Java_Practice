public class LinerSearch{
    public static int linnearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=linnearsearch(numbers,key );

        if(index ==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at "+index);
        }
    }
}