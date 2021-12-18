import java.util.Scanner;

public class Quiz2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCase = scanner.nextInt();
        int[] numberOfPeople = new int[numberOfTestCase];
        for (int i = 0; i < numberOfTestCase; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            numberOfPeople[i] = getNumberOfPeople(k, n);
        }

        print(numberOfPeople);
    }

    private static void print(int[] numberOfPeople) {
        for (int i = 0; i < numberOfPeople.length; i++) {
            System.out.println(numberOfPeople[i]);
        }
    }

    static int getNumberOfPeople(int k, int n) {
        if (k == 0) {
            return n;
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += getNumberOfPeople(k - 1, i);
        }
        return sum;
    }
}
