public class CRT {
    // a = [2,5,7]
    // rem = [1,2,3]
    // min number =x
    // x = 17

    // 10,5,2,1
    // 719


    public static void main(String[] args) {
        int[ ] a = {10,17,21};
        //rem
        int [] b = {1,2,3};
        System.out.println(CRT(a,b));
       // System.exit();

    }

    public static int CRT(int[] a , int [] b){
        long startTime = System.currentTimeMillis();
        int x =1;
        boolean numFound = false;
        while (!numFound){
            for (int i = 0; i <a.length; i++){
                if(x % a[i] != b[i]){
                    x++;
                    numFound = false;
                    break;
                }
                else
                    numFound = true;
            }
        }
        if (numFound)
            return x;
        else
            return -1;
    }
}
