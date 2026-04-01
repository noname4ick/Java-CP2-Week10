import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Date;

public class FileLogger {

    public static void writeLog(String filename, String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(filename, true));
            writer.println(new Date() + ": " + message);

            throw new RuntimeException("Simulated write error");

        } catch (IOException e) {
            System.out.println("An IO error occurred: " + e.getMessage());
        } finally {
            //finally is written as safety by preventing the file being not closed
            //cause it always runs and checks for the file is closed or not
            if (writer != null) {
                writer.close();
            }
            System.out.println("Logger closed.");
        }
    }

    public static void main(String[] args) {
        try {
            writeLog("log.txt", "System Startup");
        } catch (RuntimeException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}