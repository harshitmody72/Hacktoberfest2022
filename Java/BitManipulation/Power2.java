import java.util.Scanner;

public class Power2 {

    //Write a program to find if a number is a power of 2 or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0 ;
        int bitMask = 1<<pos;

        if((n & bitMask) == 0){
            System.out.println("Number is a power of 2");
        }else {
            System.out.println("Number is not a power of 2");
        }

}

//    // Java Program to find whether a
//// no is power of two
//    class GFG
//    {
//        /* Function to check if x is power of 2*/
//        static boolean isPowerOfTwo(int n)
//        {
//            if(n==0)
//                return false;
//
//            return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
//                    (int)(Math.floor(((Math.log(n) / Math.log(2)))));
//        }
//
//        // Driver Code
//        public static void main(String[] args)
//        {
//            if(isPowerOfTwo(31))
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//
//            if(isPowerOfTwo(64))
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//        }
//    }
//
//// This code is contributed by mits

}
