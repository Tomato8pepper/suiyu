using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 计算π的近似值
{
    class Program
    {
        static void Main(string[] args)
        {
            int i=1;
            double item = 1, sum = 0;
            double pi;
            while (1.0 / item >= 0.00000000001)//1.0可已得到一个小数，否则就是整数； 
            {
                if (i % 2 != 0)
                    sum = 1.0 / item+sum ;
                else
                    sum = sum -1.0 / item;
                i++;
                item = 2 * i - 1;
            }
            pi = 4 * sum;
            Console.WriteLine("pi的近似值是：  "+pi );
            Console.ReadKey();
        }
    }
}
