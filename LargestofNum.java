public class LargestofNum {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println(getlargest(numbers));
    }
}
