using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace n的阶乘
{
    class Program
    {
        static void Main(string[] args)
        {
            int i,n, j=1;
            Console.WriteLine("请输入n的值:");//输入的值过大，则数据溢出，整型4个字节；
            n = Convert.ToInt16(Console.ReadLine());
            for (i = 1; i <= n; i++)
                j = j * i;
            Console.WriteLine("{0}!的值是：{1}", n, j);
            Console.ReadKey();
        }
    }
}
