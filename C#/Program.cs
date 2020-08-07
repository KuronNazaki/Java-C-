using System;

namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello Motherfucker");
            Console.Write("How many numbers? : ");
            int length = Convert.ToInt32(Console.ReadLine());
            int a = 1; int b = 1;
            Fibon(a,b, length);
        }
        static void Max(int[] a)
        {
            for (int e = 0; e < 5; e ++)
            {
                for (int Nemo = e + 1; Nemo < 5; Nemo ++)
                {
                    if (a[e] >= a[Nemo])
                    { 
                        int temp = a[e];
                        a[e] = a[Nemo];
                        a[Nemo] = temp;
                    }
                }
            }
        }
        static int Century(int year)
        {
            int cent = (year/100) + 1;
            return cent;
        }
        static void Fibon(int a, int b, int length)
        {
            int d = 1;
            Console.Write(a + " " + b + " ");
            while(d < length - 1)
                {
                    d++;
                    int c = a + b;
                    a = b;
                    b = c;
                    Console.Write(c + " ");
                }
        }
    }
}