package src;
import java.util.*;

public class Pratice {
    private static Scanner scanner = new Scanner(System.in);

    public static void Question1 () {
        int height, width;
        System.out.print("Enter the height : ");
        height = scanner.nextInt();
        System.out.print("Enter the width : ");
        width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) 
                System.out.print(" * ");
            System.out.println();
        }
    }

    public static void Question2 () {
        int height, width;
        System.out.print("Enter the height : ");
        height = scanner.nextInt();
        System.out.print("Enter the width : ");
        width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1)
                    System.out.print(" * ");
                else 
                    if (j == 0 || j == width - 1)
                        System.out.print(" * ");
                    else 
                        System.out.print("   ");
            } 
            System.out.println();     
        }
    }

    public static void Question3 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k + " ");
            }
            for (int l = i - 1; l > 0; l--) {
                System.out.print(" " + l + " ");
            }
            System.out.println();
        }
    }

    public static void Question4 () {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "  ");
            }
            System.out.println();
        }
    }

    public static void Question5 () {
        Random random = new Random();
        int originalNumber = random.nextInt(101);
        int randomNumber = random.nextInt(101);
        int count = 0;

        while (randomNumber != originalNumber) {
            System.out.println(randomNumber);
            randomNumber = random.nextInt(101);
            count++;
        }
        System.out.println("While loop runs " + count + " times to find the original number : " 
                            + originalNumber);
    }

    public static void Question6 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;

        if (n == 0) {
            System.out.println("You've entered 0.");
        } else {
            if (n % 2 == 0)
                for (int i = 0; i <= n; i += 2)
                    sum += i;
            else 
                for (int i = 1; i <= n; i += 2)
                    sum += i;
        } 
        System.out.println("The sum is " + sum);
    }

    public static void Question7 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        double sum = 0.0f;

        for (int i = 1; i <= n; i++)
            sum += 1 / (double) i;

        System.out.println("The sum is " + sum);
    }

    public static void Question8 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        System.out.print("The divisors of " + n + " are 1");
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                System.out.print(", " + i);
        System.out.print(", " + n + ".");
    }

    public static void Question9 () {
        System.out.print("Enter a number : ");
        String num = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < num.length(); i++)
            sum += (int) num.charAt(i) - 48;

        System.out.println("The sum of the numbers of " + num + " is " + sum);
    }   

    public static void Question10 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int temp = n;
        StringBuilder str = new StringBuilder("");

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                while (temp % i == 0) {
                    str.append(i + ".");
                    temp /= i;
                }   
            }
        }
        str.delete(str.length() - 1, str.length());
        System.out.println(n + " is " + str.toString());
    }

    public static void Question11 () {
        int count = 0;
        int i = 0;
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        while (count < n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                i++;
                count++;
            } else 
                i++;
        }
    }

    private static boolean isPrime (final int num) {
        if (num == 0 || num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void Question12 () {
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }

    private static int getFibonacci (final int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public static void Question13 () {
        int temp = 0;

        for (int i = 100000; i < 1000000; i++) {
            StringBuilder str = new StringBuilder(String.valueOf(i));
            str.reverse();
            temp = Integer.valueOf(str.toString());
            if (temp == i)
                System.out.print(i + " ");
        }
    }

    public static void Question14 () {
        System.out.print("Enter two integers m and n so that m < n : ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int test = 0;

        if (m > n) {
            System.out.println("m > n !!!");
        } else {
            for (int i = m; i <= n; i++) {
                if (i == 0)
                    continue;
                test = (int) Math.sqrt(i);
                if (Math.pow(test, 2) == i)
                    System.out.print(i + " ");
            }
        }
    }
}