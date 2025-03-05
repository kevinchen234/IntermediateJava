
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kevinchen
 */
public class FileManager {

    public void listFiles(String directoryPath) {
        // list files
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] contents = directory.listFiles();
            if (contents != null) {
                for (File file : contents) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR]: " + file.getName());
                    } else {
                        System.out.println("[FILE]: " + file.getName());
                    }
                }
            } else {
                System.out.println("Directory is empty");
            }

        } else {
            System.out.println("Invalid directory path: Path either does not exist or is not a directory.");
        }
    }

    public void createDirectory(String directoryPath) {
        // create directory
        File directory = new File(directoryPath);
        if (directory.mkdir()) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Failed to create directory");
        }
    }

    public void deleteFileOrDirectory(String directoryOrFilePath) {
        // delete directory
        File file = new File(directoryOrFilePath);
        if (file.delete()) {
            System.out.println("Successfully deleted the file");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
