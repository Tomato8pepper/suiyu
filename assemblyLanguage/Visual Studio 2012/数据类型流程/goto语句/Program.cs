using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace goto语句
{
    class Program
    {
        static void Main(string[] args)
        {
            int n, i=1, sum = 0;
            Console.WriteLine("请输入n的值：");
            n = Convert.ToInt32(Console.ReadLine());
            ming: sum += i;
            i++;
            if (i <= n)
                goto ming;
            Console.WriteLine("1到{0}的和是：{1}",+n,sum );
            Console.ReadKey();
        }
    }
}
