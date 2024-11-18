import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine(); 
 
        System.out.println("Every second letter of the name:");
        for (int i = 0; i < name.length(); i += 2) {  // Increment by 2 to get every second letter
            System.out.println(name.charAt(i));
        }

        scanner.close();
    }
}
