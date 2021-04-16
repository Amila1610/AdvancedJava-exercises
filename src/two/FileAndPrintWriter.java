package two;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileAndPrintWriter {
    public static void main(String[] args) {
        List<String> listOfNames=new ArrayList<>();
        listOfNames.add("Ana");
        listOfNames.add("Ena");
        listOfNames.add("Ema");
        listOfNames.add("Mak");
        listOfNames.add("Toni");
        listOfNames.add("Maja");
        listOfNames.add("Ana");

        try
                (FileWriter fileWriter=new FileWriter("names.txt");
            PrintWriter printWriter=new PrintWriter(fileWriter);){
            for (String name: listOfNames){
                System.out.println(name);
                printWriter.println(name);
            }
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
