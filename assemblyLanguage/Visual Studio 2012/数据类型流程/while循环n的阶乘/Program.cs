using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace while循环n的阶乘
{
    class Program
    {
        static void Main(string[] args)
        {
            int i=1, n, j=1;
            Console.WriteLine("请输入n的值：");
            n = Convert.ToInt16(Console.ReadLine());
            while (i <= n)
            {
                j = j * i;
                i++;
            }
            Console.WriteLine("{0}!的阶乘是：{1}",n, j);
            Console.ReadKey();
        }
    }
}
