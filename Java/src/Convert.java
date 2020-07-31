package src;

public class Convert {
    private final static String hexaAlpha = "0123456789ABCDEF";
    private final static String binaryAlpha = "01";

    /**
     * With this algorithm,
     * you can convert a decimal number into 
     * a hexadecimal number or a binary number.
     */

    public static int HexaToDeci (final String hexaNumber) {
        int length = hexaNumber.length();
        int deciNumber = 0;

        for (int i = 0; i < length; i++) {
            deciNumber += hexaAlpha.indexOf(hexaNumber.charAt(i)) * Math.pow(16, length - i - 1);
        }

        return deciNumber;
    }

    public static int BinaryToDeci (final String binaryNumber) {
        int length = binaryNumber.length();
        int deciNumber = 0;

        for (int i = 0; i < length; i++) {
            deciNumber += binaryAlpha.indexOf(binaryNumber.charAt(i)) * Math.pow(2, length - i - 1);
        }

        return deciNumber;
    }

    public static String DeciToHexa(final int deciNumber) {
        StringBuilder hexaNumber = new StringBuilder("");
        int deci = deciNumber;

        while (deci != 0) {
            hexaNumber.insert(0, hexaAlpha.charAt(deci % 16));
            deci = (deci - (deci % 16)) / 16; 
        }

        return hexaNumber.toString();
    }

    public static String DeciToBinary (final int deciNumber) {
        StringBuilder binaryNumber = new StringBuilder("");
        int deci = deciNumber;

        while (deci != 0) {
            binaryNumber.insert(0, binaryAlpha.charAt(deci % 2));
            deci = (deci - (deci % 2)) / 2;
        }

        return binaryNumber.toString();
    }
}