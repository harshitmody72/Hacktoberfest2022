public class GCD {
    public static void main(String[] args) {
        System.out.println(fastGCD(6,11));
        System.out.println(gcd());
    }


    public static int gcd(){
        int a = 6;
        int b = 11;
        for(int i = Math.min(a,b) ; i >= 1 ; i --) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 0;
}

//b%a = c
    //if c == 0 then a is gcd
    // 25%10 = 5
    // 10% 5 = 0
    // so 5 is gcd

    public static int fastGCD(int a , int b){
        if(b == 0)
            return a;
        return fastGCD(b , a%b);
    }

}
