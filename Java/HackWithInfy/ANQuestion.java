package HackWithInfy;

import java.util.*;

public class ANQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }
        //Collections.sort(list,Collections.reverseOrder());
        Collections.sort(list);

        int sum = 0 ;
//        list.add(0,list.get(0));
        List<Integer> gcdList = new ArrayList<>();
//        gcdList.add(list.get(0));
        gcdList.add(list.get(n-1));

        for(int i = 0 ; i< n ; i ++){
            int max = Integer.MIN_VALUE;
            int count = 0 ;
            for(int j = 0; j < list.size();j++){
                int a = GCD(gcdList.get(i) , list.get(j));
                if(a > max){
                    max = Math.max(max , a);
                    count = j;
                }
            }
            gcdList.add(max);
            sum+=max;
            list.remove(count);
        }


//        for(int j = 1 ; j < list.size(); j ++){
//            int a = GCD(list.get(j -1) , list.get(j));
//            list.set(j , a);
//            sum += a;
//        }
        System.out.println(sum);

    }

    public static int GCD(int a , int b){
        if(b == 0)
            return a;
        return GCD(b , a%b);
    }
}
