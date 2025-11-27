package FileHandler;

import java.io.*;
import java.util.ArrayList;

public class File {
    public static void writeLines(String filename, ArrayList<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            try {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + filename);
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
