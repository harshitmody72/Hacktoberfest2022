import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int r = 2*n - 1;
        for(int i = 1; i<= r ; i++){
            if(i < n ) {
                for (int j = 1; j <= i; j++) System.out.print("* ");
            }else {
                for(int j = 1; j <= r-i+1; j++) System.out.print("* ");
            }
            System.out.println();
        }
    }
}
