using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace foreach语句
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 5, 6, 7, 8, 9 };
            foreach (int i in a)
                Console.Write(i+"  " );
            Console.ReadKey();
        }
    }
}
