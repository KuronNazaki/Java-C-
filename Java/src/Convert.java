package src;

public class Convert {
    private static String alpha = "0123456789ABCDEF";

    public static int HexaToDeci (final String hexaNumber) {
        int length = hexaNumber.length();
        int deciNumber = 0;

        for (int i = 0; i < length; i++) {
            deciNumber += alpha.indexOf(hexaNumber.charAt(i)) * Math.pow(16, length - i - 1);
        }

        return deciNumber;
    }

    public static String DeciToHexa (final int deciNumber) {
        StringBuilder hexaNumber = new StringBuilder("");
        int deci = deciNumber;

        while (deci != 0) {
            hexaNumber.insert(0, alpha.charAt(deci % 16));
            deci = (deci - (deci % 16)) / 16; 
        }

        return hexaNumber.toString();
    }

    // private static char toChar (final int i) {
    //     return alpha.charAt(i);
    // }
}