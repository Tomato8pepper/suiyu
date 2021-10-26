using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 成绩百分之switch
{
    class Program
    {
        static void Main(string[] args)
        {
            double score;
            char level;
            Console.WriteLine("请输入您的分数：");
            score = Convert.ToDouble(Console.ReadLine());
            switch ((int)score / 10)  //int，字符型，字符串型，枚举类型
            {
                case 9: level = 'A'; break;
                case 8: level = 'B'; break;
                case 7: level = 'C'; break;
                default: level = 'D'; break;
            }
            Console.WriteLine("您的分数是：{0}，您的等级是：{1}", score, level);
            Console.ReadKey();
        }
    }
}
