    import java.util.Scanner;

    public class Program2 {
        public static boolean isEven(){
            Scanner scn=new Scanner(System.in);
            int num=scn.nextInt();
            if(num%2==0){
                return true;
            }else{
                return false;
            }

        }

        public static void main(String[] args) {
            System.out.println(isEven());
        }
    }
