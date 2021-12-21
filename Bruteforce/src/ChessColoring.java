import java.util.Scanner;

public class ChessColoring {

    static int minimum = 987_654_321;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[][] array = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                array[i][j] = str.charAt(j);
            }
        }


        for (int a = 0; a <= N - 8; a++) {
            for (int b = 0; b <= M - 8; b++) {
                checkTheNumber(array, a, b);
            }
        }

        System.out.println(minimum);

    }

    static void checkTheNumber(char[][] array, int a, int b) {
        int number = 0;

        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; j++) {
                int sumOfIAndJ = i + j;

                if (sumOfIAndJ % 2 == 0) {
                    if (array[i][j] == 'W') {
                        number++;
                        continue;
                    }
                    continue;
                }

                minimum = Math.min(minimum, number);
                number = 0;
            }
        }

        for (int i = a; i < a + 8; i++) {
            for (int j = b; j < b + 8; b++) {
                int sumOfIAndJ = i + j;

                if (sumOfIAndJ % 2 == 0) {
                    if (array[i][j] == 'B') {
                        number++;
                        continue;
                    }
                    continue;
                }

                minimum = Math.min(minimum, number);
                number = 0;
            }
        }

    }

}
