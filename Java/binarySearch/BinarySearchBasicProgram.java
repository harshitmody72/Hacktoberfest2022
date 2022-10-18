package binarySearch;

import java.util.ArrayList;

public class BinarySearchBasicProgram {
        public static int solve(ArrayList<Integer> A, int B) {
            int h = A.size() -1;
            return search(A,B,0,h);
        }
        public static int search(ArrayList<Integer>A, int key, int l , int h) {
            int mid = (l + h) / 2;
            if (l > h) {
                return -1;
            }
            if (A.get(mid) == key) {
                return mid;
            }
            if (A.get(mid) > key) {
                return search(A, key, l, mid - 1);
            }
            return search(A, key, mid + 1, h);
        }
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            //3, 9, 10, 20, 17, 5, 1
            list.add(3);
            list.add(9);
            list.add(10);
            list.add(20);
            list.add(17);
            list.add(5);
            list.add(1);
        System.out.println(solve(list,20));


    }
}
