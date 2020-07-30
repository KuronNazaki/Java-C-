package src;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    public static void main(final String[] args) throws IOException { 
        Scanner scn = 
            new Scanner(Paths.get("F:\\Huy\\Study\\Java\\Java & C#\\Java\\IO data\\input.txt"), 
                            "UTF-8");
        StringBuilder str;       

        while (scn.hasNext()) {
            str = new StringBuilder(scn.nextLine());
            System.out.println(str);
        }
        scn.close();  
    }
}

