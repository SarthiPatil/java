import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileEditor <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try {
            if (file.exists()) {
               
                System.out.println("File exists. Contents:");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();

               
                System.out.print("Do you want to add data to the end of the file? (Yes/No): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("Yes")) {
                    appendToFile(file, scanner);
                }

            } else {
                
                System.out.println("File does not exist. Creating new file...");
                appendToFile(file, scanner);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void appendToFile(File file, Scanner scanner) throws IOException {
        FileWriter writer = new FileWriter(file, true); 
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        System.out.println("Enter text to write to the file. Type 'exit' on a new line to stop:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            bufferedWriter.write(input);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        System.out.println("Data successfully written to the file.");
    }
}
