/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s01reverseastring;

/**
 * S01-Reverse a string
 *
 * @author CE181985-TranMinhQuan
 */
public class Main {

    /**
     * Main method
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Create a new StringManagement object for user input
        StringManagement str = new StringManagement();
        // Use the promptUserForInput method to request user input
        str.promptUserForInput();
        // Algorithm to reverse and convert the input string
        String result = str.reverseAndConvertString();
        // Display the result using the displayOutput method
        str.displayOutput(result);
    }

}
