package search;

public class BinarySearch {
    public static void main(String[] args) {
        int b[] = {2,3,4,5,11,111,444,4444,42422};
        int n = b.length;
        int a  = 42422;
        int ab = search(b, a, 0 , n-1);
        System.out.println(ab);

    }

    static int search(int[] arr , int key , int l , int h){
        int mid = (h+l)/2;
        if(l > h){
            return -1;
        }
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] > key){
            return search(arr, key, l,mid-1);
        }
        return search(arr,key,mid+1 , h);
    }
}
