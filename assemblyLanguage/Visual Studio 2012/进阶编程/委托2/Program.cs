using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace 委托多播
{
    delegate void Del(string s);
    class Program
    {
        static void Hello(string s)
        {
            Console.WriteLine("Hello ,{0}!",s);
        }
        static void Goodbye(string s)
        {
            Console.WriteLine("Goodbye,{0}!", s);
        }
        static void Main(string[] args)
        {
            Del a, b, c, d;
            a = Hello;
            b = Goodbye;
            c = a + b;
            d = c - a;
            Console.WriteLine("Invoking delegate a:");
            a("A");
            Console.WriteLine("Invoking deleagte b:");
            b("B");
            Console.WriteLine("Invoking delegate c:");
            c("C");
            Console.WriteLine("Invoking delegate d:");
            d("D");
            Console.Read();
        }
    }
}
