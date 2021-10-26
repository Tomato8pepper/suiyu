using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace example2_1
{
    class Program
    {
        static void Main(string[] args)
        {
            float i = 3.1415926f;
            decimal m = 3.1415m;
            bool flag = true;
            bool t = ('a' > 'A');
            const double PI = 3.1415926;
            object a; a = 15;
            int[] a1 = new int[5] { 1, 3, 2, 4, 3 };
            int[,] a2 = new int[2, 3];
            int m1 = a2.GetLength(0);
            int m2 = a2.GetLength(1);
            Console.WriteLine("值一是：{0} 值二是：{1}",m1,m2 );
            float x1=1.25f,x2=1.35f;
            int x3=80, x4=6, x6=8,x7=4;
            String x5 = "123";
            x3 = (int)x2;
            x4 = int.Parse(x5);
            x6 = Convert.ToInt16("123");//提供了常用的字符串与其他类型的数据进行互换；
            Console.WriteLine("{0},{1},{2},{3}", x3, x4, x6, x7);
            Console.ReadKey();
        }
    }
}
