import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hi2 {
    public static void main(String[] args) {

        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Map<String, Integer> list = new HashMap<>();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String str = sc.nextLine();
            int x = sc.nextInt();
            sc.nextLine();
            list.put(str,x);
        }

        int i = sc.nextInt();
        sc.nextLine();
        while(i-->0){
            String s = sc.nextLine();
            System.out.println(list.getOrDefault(s,0));
        }


    }
}
