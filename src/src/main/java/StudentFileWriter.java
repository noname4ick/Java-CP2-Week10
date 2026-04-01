import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentFileWriter {
    public static void main(String[] args) {
        File file = new File("students.txt");

        if (file.exists()) {
            System.out.println("Warning: students.txt already exists and will be overwritten.");
        }

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Ali Karimov 3.85 ComputerScience");
            writer.println("Sara Ahmed 3.90 Mathematics");
            writer.println("Nematov Biloliddin 3.0 Physics");
            writer.println("Diyorbek Sobirovich 3.75 ComputerProgramming2");
            writer.println("Someone Someonelse 3.20 ACS");

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}