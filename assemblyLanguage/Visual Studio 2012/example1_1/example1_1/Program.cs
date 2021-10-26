using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace example1_1
{
    class Program
    {
        static void Main(string[] args)
        {
            String name;
            int age;
            Console.WriteLine("现在的时间：" );
            Console.WriteLine(DateTime.Now);
            Console.WriteLine("你好呀，世界");
            Console.WriteLine("请写下你的名字");
            name=Console.ReadLine();
            Console.WriteLine("请写下你的年龄");
            age = int.Parse(Console.ReadLine());
            Console.WriteLine("{0},你好，世界欢迎您！你的年龄是{1}", name, age);
            Console.ReadKey();
        }
    }
}
