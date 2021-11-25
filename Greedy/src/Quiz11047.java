import java.util.Scanner;
public class Quiz11047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfCoinType = sc.nextInt();
        int amountOfMoney = sc.nextInt();

        int[] coinType = new int[numberOfCoinType];
        for (int i = 0; i < numberOfCoinType; i++) {
            coinType[i] = sc.nextInt();
        }
        System.out.println(getCount(amountOfMoney, coinType));
    }

    private static int getCount(int amountOfMoney, int[] coinType) {
        int count = 0;
        for (int i = coinType.length - 1; i >= 0; i--) {
            if (amountOfMoney / coinType[i] >= 1) {
                count += amountOfMoney / coinType[i];
                amountOfMoney %= coinType[i];

                if (amountOfMoney == 0) {
                    break;
                }
            }
        }
        return count;
    }
}