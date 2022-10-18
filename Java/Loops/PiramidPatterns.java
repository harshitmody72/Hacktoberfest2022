import java.util.Scanner;

public class PiramidPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//
//        for(int i = 1; i <=n ; i++){
//            for (int j = 1; j <= n-i ; j++) System.out.print("  ");
//
//            for(int k = 1; k<=i;k++) System.out.print("*  ");
//            System.out.println();
//        }

        int x = 1;
        for(int i = 1; i <=n ; i++){
            for (int j = 1; j <= n-i ; j++) System.out.print("  ");

            for(int k = 1; k<=i;k++) System.out.print(x++ + "  ");
            System.out.println();
        }
    }
}
