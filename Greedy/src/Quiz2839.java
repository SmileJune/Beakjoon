import java.util.Scanner;

public class Quiz2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.println(getTotalNumber(amount));
    }

    private static int getTotalNumber(int amount) {
        int numberOfFive = amount / 5;
        int remainder = amount % 5;

        int numberOfThree = 0;
        if (remainder % 3 == 0) {
            numberOfThree = remainder / 3;
            return numberOfFive + numberOfThree;
        }

        return adjustTotalNumber(numberOfFive, numberOfThree, remainder);

    }

    private static int adjustTotalNumber(int numberOfFive, int numberOfThree, int remainder) {
        numberOfFive -= 1;
        remainder += 5;
        if (numberOfFive < 0) {
            return -1;
        }
        if (remainder % 3 == 0) {
            numberOfThree = remainder / 3;
            return numberOfFive + numberOfThree;
        }

        return adjustTotalNumber(numberOfFive, numberOfThree, remainder);
    }
}
