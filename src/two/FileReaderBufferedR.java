package two;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedR {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("names.txt");
             BufferedReader bR = new BufferedReader(fileReader);) {

            String line=null;
            System.out.println("Names from data...");
            while ((line=bR.readLine()) !=null){
                System.out.println(line);
            }

       /* } catch (FileNotFoundException e) {
            e.printStackTrace();*/
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
