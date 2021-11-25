import java.util.Arrays;
import java.util.Scanner;

public class Quiz1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfArray = sc.nextInt();
        int[] arrayA = new int[numberOfArray];
        int[] arrayB = new int[numberOfArray];

        for(int i=0; i<numberOfArray; i++){
            arrayA[i] = sc.nextInt();
        }
        for(int i=0; i<numberOfArray; i++){
            arrayB[i] = sc.nextInt();
        }
        System.out.println(getMinimumValue(arrayA,arrayB));
    }
    private static int getMinimumValue(int[] arrayA, int[] arrayB){
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        int sum=0;
        for(int i=0; i<arrayA.length; i++){
            sum += arrayA[i]*arrayB[arrayA.length-i-1];
        }
        return sum;
    }
}
