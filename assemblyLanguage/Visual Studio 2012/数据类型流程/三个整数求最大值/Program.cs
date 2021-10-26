using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 三个整数求最大值
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, y, z,max;
            Console.WriteLine("请输入三个数");
            x = Convert.ToInt16(Console.ReadLine());
            y = Convert.ToInt16(Console.ReadLine());
            z = Convert.ToInt16(Console.ReadLine());
            if (x > y)
                max = x;
            else
                max = y;
            if (z > max)
                max = z;
            Console.WriteLine("max={0}", max);
            Console.ReadKey();
        }
    }
}
