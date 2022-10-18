package search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 8,9,1,2,3,4,5,6,7};
        int key = 4;
        System.out.println(search(arr,key));

    }

    static int search(int[] arr , int key){
        int n = arr.length;
        int l = 0;
        int h = n -1;
        while (l <= h){
            int mid = (l + h )/2;
            if(arr[mid] == key){
                return mid;
            }
            //left sorted
            if(arr[mid] > arr[l]){
                if(arr[l] <= key && arr[mid] > key) {
                    h = mid - 1;
                }else {
                    l = mid+1;
                }
            }else { //right sorted
                if(arr[h]>= key && arr[mid] < key){
                    l = mid+1;
                }else{
                    h = mid -1;
                }
            }

        }
        return -1;


    }
}
