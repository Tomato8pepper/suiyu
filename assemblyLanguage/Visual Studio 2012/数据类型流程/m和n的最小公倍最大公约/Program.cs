using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace m和n的最小公倍最大公约
{
    class Program
    {
        static void Main(string[] args)
        {
            int m, n, comdiv, commul, max, min;
            Console.WriteLine("请输入两个整数：");
            m=Convert .ToInt16 ( Console.ReadLine());
            n= Convert.ToInt16(Console.ReadLine());
            if (m>n )
            {
                max = m;
                min = n;
            }
            else
            {
                max = n;
                min = m;
            }
            comdiv = min;
            do
            {
                if (max % min == 0)
                    break;
                if (max % comdiv == 0 && min % comdiv == 0)
                    break;
                comdiv--;
            } while (comdiv > 1);
            commul = max - 1;
            do
            {
                commul++;
            } while (commul % max != 0 || commul % min != 0);
            Console .WriteLine ("最大公因数是：{0}，最大公倍数是：{1}",+comdiv ,commul  );
            Console.ReadKey();

        }
    }
}
