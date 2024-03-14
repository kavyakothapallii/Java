import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String reversed = "";
        int i = input.length() - 1;
        while (i >= 0) {
            reversed += input.charAt(i);
            i--;
        }
        
        System.out.println(reversed);
        
        scanner.close();
    }
}
