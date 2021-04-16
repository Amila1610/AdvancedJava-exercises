package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        File file=new File("names.txt");
        try(Scanner scanner=new Scanner(file);){
            while(scanner.hasNext()){
               String line= scanner.nextLine();
               System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
