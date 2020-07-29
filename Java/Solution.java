import java.util.*;
//Modified
public class Solution {
    
    static int HexaToDeci (final String hexaNumber) {
        String alpha = "0123456789ABCDEF";
        int length = hexaNumber.length();
        int deciNumber = 0;

        for (int i = 0; i < length; i++) {
            deciNumber += alpha.indexOf(hexaNumber.charAt(i)) * Math.pow(16, length - i - 1);
        }

        return deciNumber;
    }

    static String DeciToHexa(final int deciNumber) {
        String hexaNumber = "";
        String alpha = "0123456789ABCDEF";


        return hexaNumber;
    }

    public static void main(final String[] args) {

        final String hexa = "BABE";
        final int deci = HexaToDeci(hexa);
        
        System.out.println(deci);
    }
}

