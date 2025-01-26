import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReaderFiles {

    public static void main(String[] args) {

        FileReader reader = null;
        try {
            reader = new FileReader("C:/Users/ondra/IdeaProjects/Herout_excercises/Herout_excercise/cat.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        } catch (Exception e) {
            System.out.println("Something doesn't work right.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file.");
                }
            }
        }
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
    }
}
