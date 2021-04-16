package two;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CheckedExecutor {
    public static void main(String[] args) {

        List<String> listOfNames= new ArrayList<>();
        listOfNames.add("Ana");
        listOfNames.add("Ena");
        listOfNames.add("Ema");
        listOfNames.add("Ella");
        listOfNames.add("Marco");
        listOfNames.add("John");
        listOfNames.add("Tom");

        try(FileWriter fileWriter=new FileWriter("names.txt");
            PrintWriter printWriter=new PrintWriter(fileWriter);)
        {
            for(String name: listOfNames){
                System.out.println(name);
                printWriter.println(name);
        }
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
