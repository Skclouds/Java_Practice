public class Subarray1 {
    public static void subarr2(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j< num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(num[k]+" ");
                }
                System.out.println();
            }

        }

    }

    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        subarr2(num);
    }
}
