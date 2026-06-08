import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {

```
public static void main(String[] args) {

    try {
        // Write Data
        FileWriter writer = new FileWriter("student.txt");
        writer.write("Name: Gaurav\n");
        writer.write("Course: Java\n");
        writer.close();

        System.out.println("Data Written Successfully!");

        // Read Data
        File file = new File("student.txt");
        Scanner fileReader = new Scanner(file);

        System.out.println("\nFile Data:");
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();

        // Modify Data
        FileWriter modify = new FileWriter("student.txt", true);
        modify.write("College: XYZ College\n");
        modify.close();

        System.out.println("\nData Modified Successfully!");

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
```

}
