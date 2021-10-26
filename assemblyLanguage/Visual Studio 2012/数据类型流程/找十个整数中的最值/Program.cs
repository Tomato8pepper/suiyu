using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 找十个整数中的最值
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, j,t;
            int max,min;//赋初值：max=int.MaxValue;  min=int.MinValue;
            int[] a=new int[10];
            Console.WriteLine("请输入十个数：");
            for (i = 0; i < 10; i++)
            {
                a[i] = Convert.ToInt16(Console.ReadLine());
            }
            for(i=0;i<a.Length-1 ;i++)
                for (j = 0; j < a.Length - i - 1; j++)
                {
                    if (a[j] > a[j + 1])
                    {
                        t = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = t;
                    }
                }
            max = a[9];
            min = a[0];
            Console.WriteLine("最大值是：{0}，最小值是：{1}", max, min);
            Console.ReadKey();
        }
    }
}
