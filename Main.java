import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();
        
        // Loop through rows
        for (int i = 1; i <= rows; i++) {
            // Loop through columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }
}