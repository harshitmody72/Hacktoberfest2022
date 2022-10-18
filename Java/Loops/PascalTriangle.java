import java.util.*;

public class PascalTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if (rows > 0){
            ArrayList<Integer> first_row = new ArrayList<>();
            first_row.add(1);
            list.add(first_row);

            for (int i = 1; i < rows; i++){
                ArrayList<Integer> previous_row = new ArrayList<>(list.get(i - 1));
                ArrayList<Integer> current_row = new ArrayList<>();

                current_row.add(1);

                for (int n = 1; n < i; n++){
                    current_row.add(previous_row.get(n) + previous_row.get(n-1));
                }

                current_row.add(1);

                list.add(current_row);


            }

            System.out.println(list);
        }

    }
}