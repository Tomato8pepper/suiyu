using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace example1_2
{
    class Program
    {
        static void Main(string[] args)
        {
            double r, s, c;
            Console.WriteLine("请输入圆的半径");
            r = Convert.ToInt32(Console.ReadLine());  //Convert是类，ToInt32是它的一个方法，转换成整型；
            s = Math.PI * r * r;//π的使用
            c = 2 * Math.PI * r;
            Console.WriteLine("圆的面积：{0}，圆的周长：{1}", s, c);
            Console.ReadKey();//暂停页面
        }
    }
}
