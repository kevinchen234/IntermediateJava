

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kevinchen
 */
public class FileApp implements UIEventHandler {

    FileManager fileManager;

    public FileApp() {
        this.fileManager = new FileManager();
    }

    public static void main(String[] args) {
        FileUserInterface ui = new FileTextBasedInterface();
        ui.subscribe(new FileApp());
        ui.start();
    }

    @Override
    public void onList(String path) {
        fileManager.listFiles(path);
    }

    @Override
    public void onCreate(String path) {
        fileManager.createDirectory(path);
    }

    @Override
    public void onDelete(String path) {
        fileManager.deleteFileOrDirectory(path);
    }
}
