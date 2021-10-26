using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace student
{
    class Student
    {
        private string name, xuehao, nianling, banji;
        public string Nianling
        {
            get { return nianling; }
            set { nianling = value; }
        }
        Student()
        {
            name = "查明国";
            xuehao = "101";
            nianling = "21";
            banji = "1";
        }
        Student(string name, string xuehao, string nianling, string banji)
        {
            this.name = name;
            this.xuehao = xuehao;
            this.nianling = nianling;
            this.banji = banji;
        }
        static void Main(string[] args)
        {
          
            Student b[] =new Student[10];
            Console.WriteLine("请依次输入姓名，学号，年龄，班级");
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("输入姓名");
                String name1 = Convert.ToString(Console.Read());

                Console.WriteLine("输入学号");
                String xuehao1 = Convert.ToString(Console.Read());

                Console.WriteLine("输入年龄");
                String nianling = Convert.ToString(Console.Read());

                Console.WriteLine("输入班级");
                String banji1 = Convert.ToString(Console.ReadLine());
                b[i]= new Student(name1, xuehao1, nianling, banji1);
                a[i] = Convert.ToDouble(bi.Nianling);
            }
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("{0}", a[i]);
            }
            for (int i = 0; i < 10; i++)
            {
                m += a[i];
            }
            double c = m / 10.0;
            Console.WriteLine("平均年龄是：{0}", c);
            Console.Read();
        }
    }
}
