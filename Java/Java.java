import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

import src.*;

public class Java {
    public static void main(final String[] args) throws IOException {
        Scanner scanner = 
                new Scanner(Paths.get(UserPath.getRelativePath("\\Java\\data\\input.hp")), "UTF-8");
        PrintWriter printer = 
                new PrintWriter(UserPath.getRelativePath("\\Java\\data\\output.hp"), "UTF-8");     
        StringBuilder str = new StringBuilder("");

        do {
            str.replace(0, str.length(), scanner.nextLine());
            printer.println(Convert.BinaryToDeci(str.toString()));
        } while (scanner.hasNext());

        printer.close();
        scanner.close();  
    }
}

