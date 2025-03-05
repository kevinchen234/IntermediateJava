/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevinchen
 */
// package com.kevinchen.passwords;

 public class App {

    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        int passwordLength = ui.getPasswordLength();
        boolean useLowerCase = ui.useLowerCase();
        boolean useUpperCase = ui.useUpperCase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        ui.displayPassword(passwordGenerator.generatePassword(passwordLength, useLowerCase, useUpperCase, useNumbers, useSymbols));
    }
}
