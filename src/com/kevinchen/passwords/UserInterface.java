/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author kevinchen
 */
public interface UserInterface {
    public int getPasswordLength();
    public boolean useLowerCase();
    public boolean useUpperCase();
    public boolean useNumbers();
    public boolean useSymbols();
    public void displayPassword(String password);
}
