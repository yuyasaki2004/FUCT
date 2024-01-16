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
public class StringManagement {

    private String inputString;

    /**
     * Default constructor
     */
    public StringManagement() {
    }

    /**
     * Constructor to initialize a StringManagement object with a specified input string.
     *
     * @param inputString The initial value for the input string.
     */
    public StringManagement(String inputString) {
        this.inputString = inputString;
    }

    /**
     * Getter method to retrieve the input string
     *
     * @return The current input string
     */
    public String getInputString() {
        return inputString;
    }

    /**
     * Setter method to update the input string
     *
     * @param inputString The new input string to set
     */
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    /**
     * Function to require user to input a String
     *
     */
    public void promptUserForInput() {
        //Use class MyLib to catch exception for user's input
        this.inputString = MyLib.getString("Enter a string: ", "Invalid input string!");
    }

    /**
     * Function to reverse and convert a string
     *
     * @return a reversed and converted string
     */
    public String reverseAndConvertString() {
        //use StringBuilder to store the reversed and converted string
        StringBuilder output = new StringBuilder();
        // Iterate through each character in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            output.append(convertCase(inputString.charAt(i)));
        }
        // Return the final result as a string
        return output.toString();
    }

    /**
     * Function to convert the case of a character
     *
     * @param c : variable to check whether is an alphabet letter
     * @return the final result convert char
     */
    public char convertCase(char c) {
        // Check if the character is an alphabet letter
        if (Character.isAlphabetic(c)) {
            //If it's a letter, check to see if it's lowercase
            if (Character.isLowerCase(c)) {
                //If it's a letter, check to see if it's lowercase
                return Character.toUpperCase(c);
            } else {
                // If uppercase, convert to lowercase  
                return Character.toLowerCase(c);
            }
        } else {
            // If the character is not an alphabet letter, keep it unchanged
            return c;
        }
    }

    /**
     * Function to display the output string
     *
     * @param outputString
     */
    public void displayOutput(String outputString) {
        System.out.println(outputString);
    }

    /**
     * the toString method to return the input string.
     *
     * @return The input string of the object.
     */
    @Override
    public String toString() {
        return inputString;
    }

}
