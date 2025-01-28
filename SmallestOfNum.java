public class SmallestOfNum {
    public static int smallestNum(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
            return smallest;
        }

        public static void main (String[]args){
            int num[] = {1, 2, 3, 4, 5, 10};
            System.out.println(smallestNum(num));
        }
    }


