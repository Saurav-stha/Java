import java.io.*;

public class ConsoleInputExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ///// Example 1: Reading an Integer//////
            // System.out.println("Enter an Integer:");
            int number = Integer.parseInt(reader.readLine());
            // System.out.println("You entered an Integer: " + number);

            // Example 2: Reading a Line of Words
            // System.out.println("Enter a line of words:");
            String line = reader.readLine();
            // System.out.println("You entered a line of words: " + line);

            // Example 3: Reading a Paragraph of Words
            System.out.println("Enter a paragraph of words (Type 'exit' on a new line to end):");
            StringBuilder paragraph = new StringBuilder();
            String inputLine;
            while (!(inputLine = reader.readLine()).equalsIgnoreCase("exit")) {
                paragraph.append(inputLine).append("\n");
            }
            System.out.println("You entered a paragraph of words:\n" + paragraph);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
