import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isUpperTriangular = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j && matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }

        if (isUpperTriangular) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
