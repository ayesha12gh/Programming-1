import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine(); 

        System.out.println("You entered: " + name);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        scanner.close();
    }
}