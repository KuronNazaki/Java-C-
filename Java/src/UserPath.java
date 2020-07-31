package src;

import java.io.File;

public class UserPath {
    public static String getRelativePath (String relativePath) {
        StringBuilder filePath = new StringBuilder(new File("").getAbsolutePath());
        return filePath.append(relativePath).toString();
    }

    /**
     * This is a method which returns the relative path of the given file.
     */
}