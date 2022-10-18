import java.util.*;

public class KnapsackProblem {
    public static void main(String[] args) {
        ArrayList<vegetable> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum weight: ");
        int weight = sc.nextInt();
        System.out.print("Enter the number of details: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int pricePerKg = sc.nextInt();
            int maximumWeight = sc.nextInt();
            sc.nextLine();
            String name  = sc.nextLine();
            vegetable v = new vegetable(pricePerKg,maximumWeight,name);
            list.add(v);
        }

        //Sorted on the basics of price per kg
        Collections.sort(list,new Comparator<vegetable>(){
            public int compare(vegetable v1 , vegetable v2){
                if(v2.pricePerKg != v1.pricePerKg)
                    return v2.pricePerKg - v1.pricePerKg;
                else{
                    return v1.maximumWeight - v2.maximumWeight;
                }
            }
        });

        //Printing the list
        System.out.println(list);

        int maximumProfitAmount = 0 ;
        int j = 0;
        int i = 0 ;
        int count = 0 ;

        while(i < list.size() && j <= weight ){
            count++;
            vegetable v = list.get(i);
            if(v.maximumWeight  <= weight - j ){
                maximumProfitAmount += v.maximumWeight * v.pricePerKg;
                j += v.maximumWeight;
                i++;
                continue;
            }
            maximumProfitAmount += v.maximumWeight * (weight - j );
            j = weight - j;
            i++;
        }
        System.out.println(maximumProfitAmount);
        System.out.println(count);



    }

}

class vegetable{
    int pricePerKg;
    int maximumWeight;
    String name;
    vegetable(int a , int b , String name){
        pricePerKg =a;
        maximumWeight = b;
        this.name = name;
    }

    @Override
    public String toString() {
        return "vegetable{" +
                "pricePerKg=" + pricePerKg +
                ", maximumWeight=" + maximumWeight +
                ", name='" + name + '\'' +
                '}';
    }
}

/*
15
5
bb
10
4
allo
20
3
ttt
30
2
bhind
25
6
flower


*/
