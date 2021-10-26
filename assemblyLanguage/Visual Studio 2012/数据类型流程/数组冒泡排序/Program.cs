using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 数组冒泡排序
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 64, 84, 25, 76, 15, 68, 95, 45, 85, 65 };
            int i, j, temp;
            Console.WriteLine("排序前的数是：");
            for (i = 0; i < 10; i++)
                Console.Write("{0}  ", a[i]);
            for (i = 1; i < a.Length; i++)
            {
                for (j = 0; j < a.Length - i; j++)
                    if (a[j] > a[j + 1])
                    {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
            }
            Console.WriteLine();
            Console.WriteLine("排序后的数是：");
            for(i=0;i<10;i++)
                Console .Write ("{0}  ",a[i]);
            Console .ReadKey ();

        }
    }
}
