import java.util.Arrays;
import java.util.Scanner;

public class Quiz11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int[] arrayOfTimeConsuming = new int[numberOfPeople];

        for (int i = 0; i < arrayOfTimeConsuming.length; i++) {
            arrayOfTimeConsuming[i] = sc.nextInt();
        }

        System.out.println(getMinimumTime(arrayOfTimeConsuming));
    }
    private static int getMinimumTime(int[] arrayOfTimeConsuming){
        Arrays.sort(arrayOfTimeConsuming);
        int sum=0;
        for(int i=0; i<arrayOfTimeConsuming.length; i++){
            for(int j=0; j<=i; j++){
                sum += arrayOfTimeConsuming[j];
            }
        }
        return sum;
    }
}
