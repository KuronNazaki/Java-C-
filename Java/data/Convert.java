package data;

public class Convert {

    public static int HexaToDeci (final String hexaNumber) {
        String alpha = "0123456789ABCDEF";
        int length = hexaNumber.length();
        int deciNumber = 0;

        for (int i = 0; i < length; i++) {
            deciNumber += alpha.indexOf(hexaNumber.charAt(i)) * Math.pow(16, length - i - 1);
        }

        return deciNumber;
    }

}