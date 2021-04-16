package two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReader1 {
    public static void main(String[] args) {

        try (FileReader fileReader=new FileReader("names.txt");
             BufferedReader br= new BufferedReader(fileReader);
             Scanner sc=new Scanner(br);
             ){
            System.out.println("Send names from file...");
            while (sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);
            }
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
