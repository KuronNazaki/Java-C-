
// import java.io.File;
import java.io.IOException;
// import java.io.PrintWriter;
// import java.nio.file.Paths;
// import java.util.*;

import src.Convert;

public class Java {
    public static void main(final String[] args) throws IOException {
        // Scanner scn = 
        //     new Scanner(Paths.get("F:\\Huy\\Study\\Java\\Java & C#\\Java\\IO data\\input.txt"),
        //                  "UTF-8");
        // PrintWriter printer = 
        //     new PrintWriter("F:\\Huy\\Study\\Java\\Java & C#\\Java\\IO data\\output.txt",
        //                  "UTF-8");
        // StringBuilder str;       

        // while (scn.hasNext()) {
        //     str = new StringBuilder(scn.nextLine());
        //     printer.println(str);
        // }
        
        // printer.close();

        int deci = 1087;
        System.out.println(Convert.DeciToHexa(deci));
        // scn.close();  
    }
}

