using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 找数字
{
    class Program
    {
        static void Main(string[] args)
        {
            int i=0,num;
            Console .WriteLine ("请输入一个数");
            num =Convert.ToInt16 ( Console .ReadLine ());
            int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            while (i < a.Length)
            {
                if (num == a[i])
                {
                    Console.WriteLine("{0}是数组中的{1}个元素", num, i);
                    break;
                }
                i++;
                if (i == a.Length)
                    Console.WriteLine("在数组中没有找到{0}", num);
            }
            Console.ReadKey();
        }
    }
}
