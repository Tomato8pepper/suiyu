using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace 计算总成绩及平均分
{
    class Program
    {
        static void Main(string[] args)
        {
            String name;
            double avage=0, sum=0;
            double[] a = new double[5];
            Console.WriteLine("请输入姓名：");
            name = Convert.ToString(Console.ReadLine());
            Console.WriteLine("请依次输入语文、数学、英语、物理、化学:");
            for (int i = 0; i < 5; i++)
                a[i] = Convert.ToDouble(Console.ReadLine());
            for (int i = 0; i < 5; i++)
                sum += a[i];
            avage = sum / 5;
            Console.WriteLine("{0}的总成绩是：{1}，平均分是：{2}", name, sum, avage);
            Console.ReadKey();
        }
    }
}
