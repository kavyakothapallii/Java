import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        sortFirstHalf(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    public static void sortFirstHalf(int[] arr) {
        int halfLength = arr.length / 2;
        Arrays.sort(arr, 0, halfLength);
    }
}
