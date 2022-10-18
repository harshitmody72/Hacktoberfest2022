import java.util.Scanner;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        st = st.trim();
        String[] str = st.split(" ");

        for (int i = str.length - 1; i >=0 ;i--){
            if(str[i] == "") continue;
            System.out.print(str[i]+" ");
        }
    }
}
