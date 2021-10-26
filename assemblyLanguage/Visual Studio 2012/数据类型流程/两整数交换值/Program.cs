using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 两整数交换值
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("请输入第一个值a=");
            int i = Convert.ToInt16(Console.ReadLine());
            Console.Write("请输入第二个值b=");
            int j = Convert.ToInt16(Console.ReadLine());
            int t;
            t = i;
            i = j;
            j = t;
            Console.WriteLine("a={0}   b={1}", i, j);
            Console.ReadKey();

        }
    }
}
