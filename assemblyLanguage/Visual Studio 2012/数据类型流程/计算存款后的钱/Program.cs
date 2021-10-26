using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 计算存款后的钱
{
    class Program
    {
        public Program()  //ctor两下tab就可以了；
        {

        }
        static void Main(string[] args)
        {
            const decimal interest = 0.0035m;
            decimal money, principal;
            int t;
            Console.WriteLine("请输入您的存款金额：");
            money = Convert.ToDecimal(Console.ReadLine());
            Console.WriteLine("请输入您的存款期限（单位/月）:");
            t = Convert.ToInt16(Console.ReadLine());
            principal = money + money * interest * t * 1 / 12;
            Console.WriteLine("您的存款是：{0}，存了{1}个月，本息和是：{2:f}", money, t, principal);//{2:f}的意思是
            Console.ReadKey();
        }
    }
}