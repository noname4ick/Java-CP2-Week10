import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentFileReader {
    public static void main(String[] args) {
        File file = new File("students.txt");
        int count = 0;

        System.out.println("Name        GPA         Major");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                String firstName = fileScanner.next();
                String lastName = fileScanner.next();
                double gpa = fileScanner.nextDouble();
                String major = fileScanner.next();
                String fullName = firstName + " " + lastName;
                System.out.printf("%s       %.2f    %s%n", fullName, gpa, major);
                count++;
            }
            System.out.println("Total students: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'students.txt' was not found. Please run the writer first.");
        } catch (Exception e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }
}