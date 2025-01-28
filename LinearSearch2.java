import java.util.*;
public class LinearSearch2 {
    public static int lineear2(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String menu[]={"juice","idli","wada","dabeli"};
        String key="wada";
        int index=lineear2(menu,key);
        if(index==-1){
            System.out.println("not found");
    }else {
            System.out.println("The index is at "+index);
        }
}
}
