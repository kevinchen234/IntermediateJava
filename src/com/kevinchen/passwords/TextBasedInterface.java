
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinchen
 */
public class TextBasedInterface implements UserInterface {

    private Scanner scanner;

    public TextBasedInterface() {
      this.scanner = new Scanner(System.in);
    }

  @Override
  public int getPasswordLength() {
    System.out.print("Please enter the password length: ");
    return scanner.nextInt();
  }

  @Override
  public boolean useLowerCase() {
    System.out.print("Would you like the password to have lowercase letters? (y/n): ");
    return scanner.next().equalsIgnoreCase("y");
  }

  @Override
  public boolean useUpperCase() {
    System.out.print("Would you like the password to have uppercase letters? (y/n): ");
    return scanner.next().equalsIgnoreCase("y");
  }

  @Override
  public boolean useNumbers() {
    System.out.print("Would you like the password to have numerical characters? (y/n): ");
    return scanner.next().equalsIgnoreCase("y");
  }

  @Override
  public boolean useSymbols() {
    System.out.print("Would you like the password to have symbol characters? (y/n): ");
    return scanner.next().equalsIgnoreCase("y");
  }

  @Override
  public void displayPassword(String password) {
    System.out.println("Here is the password: " + password);
  }

}
