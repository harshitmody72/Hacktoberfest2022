public class Power{
    public static void main(String[] args) {
        System.out.println(pow(5,5));

    }

    static int pow(int a , int b){
        if(b == 0){
            return 1;
        }
        if(b %2==0)
            return pow(a*a,b/2);        // (a^2)^b/2 = a^b

        return a* pow(a,b-1);
    }
}
