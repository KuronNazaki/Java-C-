using System;

namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello Motherfucker");
            Console.WriteLine(wcln(45, 36));
            Console.WriteLine(bcnn(45, 36));
        }
        static int Turn(int a, int b)
        {
            int check;
            if (a + b > 100)
            {
                Console.WriteLine("Sum is greater than 100.");
                check = 1;
            }
            else if(a + b < 100)
            {
                Console.WriteLine("Sum is less then 100.");
                check = 0;
            }
            else
            {
                Console.WriteLine("Sum is 100.");
                check = 2;
            }
            return check;
        }
        public static int wcln(int a, int b)
        {
            if (a == 0)
            {
                return b;
            }
            if (b == 0)
            {
                return a;
            }
            if (a == b)
            {
                return a;
            }
            if (a > b)
            {
                return wcln(a - b, b);
            }
            return wcln(a, b-a);
        }
        static int bcnn(int a, int b)
        {
            int small = (a * b) / wcln(a, b);
            return small;
        }

    }
}