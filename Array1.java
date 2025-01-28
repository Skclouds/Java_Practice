import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int arrName[]={1,2,3,4,5,67};
        System.out.println(arrName);//if I will print this so it will give the output of hascode
        System.out.println(Arrays.toString(arrName));//I have to import the Arrays from util class of the Java and convert it to the String so it will show the output as normal Array
        System.out.println("1"+":"+arrName[0]);
        System.out.println("2"+":"+arrName[2]);
        System.out.println("3"+":"+arrName[4]);
        System.out.println(arrName.length);//To check the length of an array
    }
}
