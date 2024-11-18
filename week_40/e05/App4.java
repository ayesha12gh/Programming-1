import java.util.Scanner;

public class App4{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Enter a name (or type 'Quit' to stop): ");
            String name = scanner.nextLine(); // Read the user's input
 
            if (name.equalsIgnoreCase("Quit")) {
                System.out.println("Program has finished.");
                break; 
            }

            System.out.println("You entered: " + name);
        }

        scanner.close();
    }
}
