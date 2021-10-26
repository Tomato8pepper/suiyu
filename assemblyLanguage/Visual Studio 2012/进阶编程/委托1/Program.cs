using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 委托1
{
    delegate int Max(int first,int second);
    class Maxest
    {
        public int IntMax(int a, int b)
        {
            if (a > b)
                return a;
            else
                return b;
        }
        public double DoubleMax(double a, double b)
        {
            if (a > b)
                return a;
            else
                return b;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Max max;
            Maxest ms = new Maxest();
            max = new Max(ms.IntMax);
            int a=max(2,3);
            Console.WriteLine(a.ToString());
            Console.ReadKey();
        }
    }
}
