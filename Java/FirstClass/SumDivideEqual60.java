import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SumDivideEqual60 {
    //30,40,60,80,100,120
    //30+40 % 60 == 0;
    public static void main(String[] args) {

        int a[] = {30,40,60,80,100,120}; //-- 3

        fastDivide(a);
        divide(a);


    }
    static void fastDivide(int a[]){
        int count = 0 ;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i = 0 ; i < a.length ; i ++){
            int remainder = a[i] % 60 ;
            if(map.containsKey(remainder)){
                int currentCount = map.get(remainder);
                map.put(remainder , ++currentCount);
            }else {
                map.put(remainder,1);
            }
        }
        System.out.println(map.toString());

       Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> mapSet = iterator.next();
            if(mapSet.getKey() >= 30){
                continue;
            }
            int key = 60 - mapSet.getKey() ;
            if(map.containsKey(key)) {
                count = count + mapSet.getValue() * map.get(key);
            }
        }
        if(map.containsKey(30)) {
            int count30 = map.get(30) / 2;
            count += count30;
        }
        if(map.containsKey(0)) {
            int count0 = map.get(0) / 2;
            count += count0;
        }
        System.out.println(count);
    }








    static void divide(int a[]){
        for(int i = 0 ;  i < a.length -1 ; i++){
            for(int j = i +1 ; j < a.length ; j++ ){
                int c =a[i] + a[j];
                if(c %60 == 0){
                    System.out.println(a[i] + " " +  a[j]);
                }
            }
        }

    }
}
