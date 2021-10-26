using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 计算器
{
    class Program
    {
        static void Main(string[] args)
        {
            double num1, num2, answer = 0;
            char opt, quit='c';
            do
            {
                Console.WriteLine("请输入算式：");
                num1 = Convert.ToDouble(Console.ReadLine());
                opt = Convert.ToChar(Console.ReadLine());
                num2 = Convert.ToDouble(Console.ReadLine());
                switch (opt)
                {
                    case '+': answer = num1 + num2; break;
                    case '-': answer = num1 - num2; break;
                    case '*': answer = num1 * num2; break;
                    case '/': if (num2 == 0)
                            Console.WriteLine("除数不能为零");
                        else
                            answer = num1 / num2; break;
                    default: Console.WriteLine("输入错误：请重新输入！");
                        break;
                }
                        Console.WriteLine("{0}{1}{2}={3}", num1, opt, num2, answer);
                        Console.WriteLine("是否还要继续,请按q结束：");
                        Console.ReadKey();
            } while (quit != 'Q' && quit != 'q');
            Console.WriteLine("计算结束");
            Console.ReadKey();
        }
    }
}
