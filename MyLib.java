/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01reverseastring;

import java.util.Scanner;

/**
 * S01-Reverse a string
 *
 * @author CE181985-TranMinhQuan
 */
public class MyLib {

    static Scanner sc = new Scanner(System.in);

    /**
     *
     * Function to help user to input a string
     *
     * @param iMsg message that help user understand the input value
     * @param iError error to reject user's input
     * @return a string input by the user
     */
    public static String getString(String iMsg, String iError) {
        while (true) {
            try {
                // Message to help the user enter a string
                System.out.print(iMsg);
                String str = sc.nextLine();
                // Check if there is more than one special character in the string
                long specialCharCount = str.chars().filter(ch -> isSpecialCharacter((char) ch)).count();
                // Check if the second-to-last character is also a special character
                if (str.length() >= 2) {
                    char secondToLastChar = str.charAt(str.length() - 2);
                    if (isSpecialCharacter(secondToLastChar)) {
                        throw new Exception("Input cannot end with two special characters in a row.");
                    }
                }
                // Check if the string contains any numeric characters
                if (containsNumericCharacters(str)) {
                    throw new Exception("Input cannot contain numeric characters.");
                }
                // Combined condition: Check if there is more than one special character or the second-to-last character is a special character
                if (specialCharCount > 1) {
                    throw new Exception("Input cannot contain more than one special character.");
                }
                // If the string is null or empty, reject it
                if (str.length() == 0) {
                    throw new Exception("Input cannot be empty.");
                }

                return str;
            } catch (Exception e) {
                // Output the exception for wrong input           
                System.out.println(iError + " " + e.getMessage());
            }
        }
    }

    /**
     * Checks if a given character is considered a special character.
     *
     * @param c The character to be checked.
     * @return True if the character is a special character, false otherwise.
     */
    private static boolean isSpecialCharacter(char c) {
        // Customize this method to define what characters are considered special
        String specialChars = "!@#$%^&*()_-+=<>?/,.:;";
        return specialChars.indexOf(c) != -1;
    }

    /**
     * Checks if the given string contains numeric characters.
     *
     * @param str The string to be checked.
     * @return True if the string contains numeric characters, false otherwise.
     */
    private static boolean containsNumericCharacters(String str) {
        return str.chars().anyMatch(Character::isDigit);
    }
}
