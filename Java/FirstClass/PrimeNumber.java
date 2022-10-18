import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long start = System.currentTimeMillis();
       boolean isPrime = prime(n);
       long end = System.currentTimeMillis();
       long diff = end - start;
       System.out.println(diff);
        if(isPrime)
        System.out.println("number is Prime");
        else System.out.println("number is not prime");
    }

    public static boolean prime(long n){
        for (long i = 2; i < n ; i++){
            if(n%i == 0 ){
                return false;
            }
        }
        return true;
    }

    //Fermat little theorem
    //n = number
    // 1< a < n
    // a^n-1 mod n == 1
    // some restriction
    // sudo a also exists in the 1<a<n where the theorem is true but still the number is not prime

    public static long generatePower(long n){
        long r = (long) ((Math.random() )* (n-3) + 2);
        System.out.println(r);
        return r;
    }

    public static long fastPow(long a , long b ){
        if (b == 0)
            return 1;
        if (b%2 == 0)
            return fastPow(a*a , b/2);
        return (long)(a * fastPow(a,b-1));
    }

    public static boolean fastPrime(long n ){
        long a = generatePower(n);
        long pow;

        for(int i = 0; i< 3; i++){
            pow = fastPow(a,(n-1));
            System.out.println(a+"  "+ n);
            System.out.println(pow + " : "+ pow  % n);
            if(pow  % n != 1) {
                return false;
            }
            a = generatePower(n);
        }
        return true;
    }

    public static boolean primeSqrt(long n){

        if(n<2)
            return false;

        for (long i = 2; i*i <= n ; i++){
            if(n % i == 0)
                return false;
        }

        return true;
    }


}
//    ArrayList<Integer> list = new ArrayList<>();
//    int n = A;
//        if(n < 2){
//        return list;
//        }
//        if(n == 2){
//        list.add(2);
//        return list;
//        }
//        list.add(2);
//        for(int i = 2; i <= n ; i++){
//        boolean isPrime = true;
//        for(int j = 2; j*j<= n ;j++ ){
//        if(n % j == 0){
//        isPrime = false;
//        }
//
//        }
//        if(isPrime){
//        list.add(i);
//        }
//
//        }
//        return list;
//        \
//
//
//public ArrayList<Integer> sieve(int A) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = A;
//        if(n < 2){
//        return list;
//        }
//        if(n == 2){
//        list.add(2);
//        return list;
//        }
//        list.add(2);
//        for(int i = 2; i <= n ; i++){
//        boolean isPrime = true;
//        for(int j = 2; j*j<= n ;j++ ){
//        if(n % j == 0){
//        isPrime = false;
//        }
//
//        }
//        if(isPrime){
//        list.add(i);
//        }
//
//        }
//        return list;
//
//        }