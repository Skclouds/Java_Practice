import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int temp=num;
        int reversed=0;

        while(num!=0){
            int lastDigit=num%10;
            reversed=reversed*10+lastDigit;
            num=num/10;

        }
       if(temp==reversed){
           System.out.println(temp+"it is the palindrome");
       }else{
           System.out.println(temp+"it is not the palindrome");
       }
    }

}
