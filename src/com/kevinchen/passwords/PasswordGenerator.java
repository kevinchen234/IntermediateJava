
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kevinchen
 */
// package com.kevinchen.passwords;
public class PasswordGenerator {

    String generatePassword(int passwordLength, boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSymbols) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String allChars = buildCharOptions(useLowerCase, useUpperCase, useNumbers, useSymbols, lowercase, uppercase, digits, symbols);

        while (true) {
            String pass = generateRandomPassword(passwordLength, allChars);
            if (isValidPassword(pass, useLowerCase, useUpperCase, useNumbers, useSymbols, lowercase, uppercase, digits, symbols)) {
                return pass;
            }
            System.out.println("Invalid password generated: " + pass + ". Regenerating...");
        }
    }

    private String buildCharOptions(boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSymbols, String lowercase, String uppercase, String digits, String symbols) {
        StringBuilder charOptions = new StringBuilder();
        charOptions.append(useLowerCase ? lowercase : "");
        charOptions.append(useUpperCase ? uppercase : "");
        charOptions.append(useNumbers ? digits : "");
        charOptions.append(useSymbols ? symbols : "");
        return charOptions.toString();
    }

    private String generateRandomPassword(int passwordLength, String allChars) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < passwordLength; i++) {
            char nextLetter = allChars.charAt(random.nextInt(allChars.length()));
            password.append(nextLetter);
        }
        return password.toString();
    }

    private boolean isValidPassword(String pass, boolean useLowerCase, boolean useUpperCase, boolean useNumbers, boolean useSymbols, String lowercase, String uppercase, String digits, String symbols) {
        if (useLowerCase && !hasOverlap(pass, lowercase)) {
            return false;
        }
        if (useUpperCase && !hasOverlap(pass, uppercase)) {
            return false;
        }
        if (useNumbers && !hasOverlap(pass, digits)) {
            return false;
        }
        if (useSymbols && !hasOverlap(pass, symbols)) {
            return false;
        }
        return true;
    }

    private boolean hasOverlap(String s1, String s2) {
      for (char c : s1.toCharArray()) {
        if (s2.contains(String.valueOf(c))) {
          return true;
        }
      }
      return false;
    }
}
