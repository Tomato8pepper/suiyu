using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 打折
{
    class Program
    {
        static void Main(string[] args)
        {
            double money, pay;
            Console.WriteLine("请输入金额：");
            money = Convert.ToDouble(Console.ReadLine());
            switch ((int)money / 1000)
            {
                case 0: pay = money; break;
                case 1: pay = money * 0.9;
                    Console.WriteLine("请问有教师证或者老人证吗？(y/n)");
                    if (Convert.ToChar(Console.ReadLine()) == 'y')
                        pay = pay * 0.95;
                    break;
                default: pay = money * 0.85;
                    Console.WriteLine("请问有教师证或者老人证吗？(y/n)");
                    if (Convert.ToChar(Console.ReadLine()) == 'y')
                        pay = pay * 0.95;
                    break;
            }
            Console.WriteLine("您消费了{0}元，打折后的费用是：{1}", money, pay);
            Console.ReadKey();

        }
    }
}
