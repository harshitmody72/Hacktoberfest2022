import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int gcdNumber = gcd(a,b);
        if(c%gcdNumber == 0 ){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }


    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    //ax + by = c
    // x and y be integer
    //a,b = gcd
    //c/gcd == 0 then x and y are possible
    //true

}
