public class BinearSearch1 {
    public static int binneary(int arr[],int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
        public static void main(String[]args){
            int arr[]={2,4,6,7,8,10,12,14};
            int target=10;
            int result=binneary(arr, target);
            if(result==-1){
                System.out.println("Index not found ");
            }else{
                System.out.println(result);
            }

        }
    }

