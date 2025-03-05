
import java.util.Scanner;

public class FileTextBasedInterface implements FileUserInterface {

    private UIEventHandler handler = null;

    @Override
    public void start() {
        System.out.println("File Manager Menu");
        System.out.println("1. List files");
        System.out.println("2. Create a directory");
        System.out.println("3. Delete a file or directory");
        System.out.println("4. Exit program");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter directory path: ");
                    handler.onList(scanner.nextLine());
                }
                case 2 -> {
                    System.out.println("Enter directory path: ");
                    handler.onCreate(scanner.nextLine());
                }
                case 3 -> {
                    System.out.println("Enter path of file or directory to delete: ");
                    handler.onDelete(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    @Override
    public void subscribe(UIEventHandler handler) {
        if (this.handler == null) {
            this.handler = handler;
        }
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
