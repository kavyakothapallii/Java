import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageDifference = scanner.nextInt();
        int totalAge = scanner.nextInt();
        scanner.close();
        int cubsAge = (totalAge - ageDifference) / 3;
        int fatherAge = cubsAge + ageDifference;
        System.out.println("Father lion's age is " + fatherAge);
        System.out.println("Cub's age is " + cubsAge);
    }
}
