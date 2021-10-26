using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 条件分支
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, y;
            Console.WriteLine("请输入x的值");
            x=Convert .ToInt16( Console.ReadLine());
            if (x < 1)
                y = x-1;
            else if (x >= 1 && x <= 3)
                y = x;
            else
                y = x*2;
            Console.WriteLine("y={0}", y);
            Console.ReadKey();


        }
    }
}
