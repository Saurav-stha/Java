import java.io.*;
import java.net.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Create a BufferedReader to read data from the input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read and print the content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader and input strea
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
