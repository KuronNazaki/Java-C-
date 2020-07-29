package data;

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
        String hexaNumber = "";
        int r = deciNumber % 16;

        if ((deciNumber - r) == 0) {
            return hexaNumber + toChar(r);
        } else {
            return hexaNumber + DeciToHexa((deciNumber - r) / 16) + toChar(r);
        }
    }

    private static char toChar (final int i) {
        return alpha.charAt(i);
    }
}