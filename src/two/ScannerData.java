package two;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerData {
    public static void main(String[] args) {
        File file=new File("names.txt");

        try(Scanner sc=new Scanner(file);){

           System.out.println("Names...");
           while (sc.hasNext()){
               String line= sc.next();
               System.out.println(line);
           }

        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
