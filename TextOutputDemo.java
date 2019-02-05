import java.io.*;
import java.util.*;

public class TextOutputDemo {
    public static void main(String[] args){
        String fileName = "out.txt";
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }

        System.out.println("Enter three lines of text:");
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            String line = keyboard.nextLine();
            outputStream.println(i + " " + line);
        }
        outputStream.close();
        System.out.println("The content was saved on " + fileName);
    }
}
