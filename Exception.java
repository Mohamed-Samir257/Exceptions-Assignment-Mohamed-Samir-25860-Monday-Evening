
import java.io.*;
    import java.sql.*;

public class Exception {
    /*
     * Assignment: Understanding and Handling OOP/Java Exceptions
     * Objective: This program demonstrates various Java exceptions,
     *            their triggers, and proper handling mechanisms using alternative examples.
     */
    
    
    
    
    
        public static void main(String[] args) {
            // Checked Exceptions
            handleIOException();
            handleFileNotFoundException();
            handleEOFException();
            handleSQLException();
            handleClassNotFoundException();
    
            // Unchecked Exceptions
            handleArithmeticException();
            handleNullPointerException();
            handleArrayIndexOutOfBoundsException();
            handleClassCastException();
            handleIllegalArgumentException();
            handleNumberFormatException();
        }
    
        // Checked Exception 1: IOException
        private static void handleIOException() {
            try {
                Process process = Runtime.getRuntime().exec("nonexistent_command");
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    
        // Checked Exception 2: FileNotFoundException
        private static void handleFileNotFoundException() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("unknown.txt"));
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException caught: " + e.getMessage());
            }
        }
    
        // Checked Exception 3: EOFException
        private static void handleEOFException() {
            try (DataInputStream input = new DataInputStream(new ByteArrayInputStream(new byte[0]))) {
                input.readUTF();
            } catch (EOFException e) {
                System.out.println("EOFException caught: Reached end of input stream.");
            } catch (IOException e) {
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    
        // Checked Exception 4: SQLException
        private static void handleSQLException() {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistent_db", "root", "password");
            } catch (SQLException e) {
                System.out.println("SQLException caught: " + e.getMessage());
            }
        }
    
        // Checked Exception 5: ClassNotFoundException
        private static void handleClassNotFoundException() {
            try {
                Class.forName("java.lang.NonExistentClass");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 6: ArithmeticException
        private static void handleArithmeticException() {
            try {
                int result = Math.floorDiv(10, 0);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 7: NullPointerException
        private static void handleNullPointerException() {
            try {
                Object obj = null;
                obj.hashCode();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 8: ArrayIndexOutOfBoundsException
        private static void handleArrayIndexOutOfBoundsException() {
            try {
                char[] chars = {'a', 'b', 'c'};
                char invalidChar = chars[10];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 9: ClassCastException
        private static void handleClassCastException() {
            try {
                Object obj = "Hello, World!";
                Integer number = (Integer) obj;
            } catch (ClassCastException e) {
                System.out.println("ClassCastException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 10: IllegalArgumentException
        private static void handleIllegalArgumentException() {
            try {
                Thread thread = new Thread();
                thread.setPriority(-1); // Invalid priority (must be 1-10)
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());
            }
        }
    
        // Unchecked Exception 11: NumberFormatException
        private static void handleNumberFormatException() {
            try {
                double number = Double.parseDouble("not_a_number");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException caught: " + e.getMessage());
            }
        }
}



