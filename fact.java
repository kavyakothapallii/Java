import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long sum = 0;
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println(sum);
    }
}
