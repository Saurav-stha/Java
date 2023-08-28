import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Write bytes of data to the file
        try (FileOutputStream outputStream = new FileOutputStream("exam.jsp")) {
            String content = "This is some example content.";
            // byte[] bytes = content.getBytes();
            outputStream.write(content);
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read and print the content of the file
        try (FileInputStream inputStream = new FileInputStream("exam.jsp")) {
            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                System.out.print((char) byteRead);
            }
            System.out.println("\nData read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
