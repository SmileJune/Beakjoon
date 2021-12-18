import java.util.Scanner;

public class Quiz2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(checkMinimumStep(N));
    }

    static int checkMinimumStep(int N) {
        int step = 1;
        int theLargestNumberInAStep = 1;

        if (N == 1) {
            return step;
        }

        while (true) {
            int Interval = 6 * step;
            theLargestNumberInAStep += Interval;
            step++;

            if (N <= theLargestNumberInAStep) {
                return step;
            }
        }
    }
}
