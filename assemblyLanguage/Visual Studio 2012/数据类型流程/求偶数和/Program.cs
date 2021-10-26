using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 求偶数和
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, sum = 0, n;
            Console.WriteLine("请输入n的值：");
            n = Convert.ToInt16(Console.ReadLine());
            for (i = 0; i <= n; i++)
            {
                if (i % 2 != 0)
                    continue;//中断此次循环，开始下一次；
                else
                    sum = sum + i;
            }
            Console.WriteLine("偶数和是：" + sum);
            Console.ReadKey();
        }
    }
}
