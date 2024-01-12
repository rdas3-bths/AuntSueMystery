import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Create 500 Aunt Sues!
        AuntSue[] sues = new AuntSue[500];
        for (int i = 1; i <= sues.length; i++) {
            sues[i-1] = new AuntSue(i);
        }

        String[] fileData = getFileData("data/sue_notes");

        for (int i = 0; i < sues.length; i++) {
            AuntSue currentSue = sues[i];
            String currentSueData = fileData[i];
            currentSue.updateSue(currentSueData);
        }

        // STEP 2: After all Sues are updated..
        // We know the correct sue has this data:
        // children: 3
        // cats: 7
        // samoyeds: 2
        // pomeranians: 3
        // akitas: 0
        // vizslas: 0
        // goldfish: 5
        // trees: 3
        // cars: 2
        // perfumes: 1

        // Given what we know about each sue, and the data above, WHICH IS THE REAL SUE?!
    }

    public static String[] getFileData(String filePath) {
        File f = new File(filePath);
        Scanner s = null;
        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. Fix path!");
            System.exit(1);
        }

        String fileData = "";
        while (s.hasNextLine()) {
            fileData += s.nextLine() + "\n";
        }

        String[] fileArray = fileData.split("\n");
        return fileArray;
    }
}