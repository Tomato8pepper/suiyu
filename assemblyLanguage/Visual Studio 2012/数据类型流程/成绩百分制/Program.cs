using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 成绩百分制
{
    class Program
    {
        static void Main(string[] args)
        {
            double score;
            char level;
            Console.WriteLine("请输入您的分数");
            score = Convert.ToDouble(Console.ReadLine());
            if (score > 90)
                level = 'A';
            else if (score > 80 && score <= 90)
                level = 'B';
            else if (score > 70 && score <= 80)
                level = 'C';
            else
                level = 'E';
            Console.WriteLine("您的成绩是：{0} 您的等级：{1}", score, level);
            Console.ReadKey();
        }
    }
}
