import java.util.Scanner;

public class CoinCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a amount: ");
        int amount =sc.nextInt();
        System.out.println("total coin : " +coin(amount));

    }
    //10 5 2 1

    public static int coin(int amount){
        int[] denominationArr = {10,5,2,1};
        int coinCount = 0;
        for(int i = 0; i < denominationArr.length; i++){
            coinCount += amount/denominationArr[i];
            System.out.println( denominationArr[i] + ": " + (amount/denominationArr[i]));
            amount  = amount -  ((amount/denominationArr[i])*denominationArr[i]);
        }
        return coinCount;
    }

    // recursion;
}
