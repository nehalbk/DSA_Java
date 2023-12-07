package BasicJavaFeaturePrograms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        // Define input and output file paths
        String inputFile = "D:\\Projects\\DSA_Java\\src\\fileinput.txt";
        String outputFile = "D:\\Projects\\DSA_Java\\src\\fileoutput.txt";

        try {
            // Read data from the input file
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create a FileWriter and BufferedWriter for the output file
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Process each line from the input file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Convert the line to uppercase
                String uppercaseLine = line.toUpperCase();

                // Write the uppercase line to the output file
                bufferedWriter.write(uppercaseLine);
                bufferedWriter.newLine();
            }

            // Close the readers and writers
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File handling completed successfully.");

        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
