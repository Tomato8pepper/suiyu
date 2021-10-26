using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 结构体
{
    enum Direction
    {
        Design, Business, Testing, Game
    }
    struct Student
    {
        public int no;
        public String name;
        public String sex;
        public Direction direction;
        public int credit;
        public bool isGraduate;
        public string Status()
        {
            if (isGraduate)
            {
                return "毕业";
            }
            else
            {
                return "在读";
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Student[] student = new Student[2];
            for (int i = 0; i < student.Length; i++)
            {
                Console.WriteLine("请输入第{0}位学生信息", i + 1);
                Console.WriteLine("请输入学号");
                student[i].no = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("请输入姓名");
                student[i].name = Console.ReadLine();
                Console.WriteLine("请输入性别");
                student[i].sex = Console.ReadLine();
                Console.WriteLine("请输入专业方向");
                student[i].direction = (Direction)int.Parse(Console.ReadLine());
                Console.WriteLine("请输入学分");
                student[i].credit = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("请输入是否毕业");
                student[i].isGraduate = Convert.ToBoolean(Console.ReadLine());
            }
            Console.WriteLine("=====================学院信息表====================");
            Console.WriteLine("学号\t姓名 \t性别 \t专业方向 \t 学分\t是否毕业");
            foreach (Student s in student)
            {
                Console.Write("{0}\t",s.no);
                Console.Write("{0}\t",s.name);
                Console.Write("{0}\t",s.sex);
                Console.Write("{0}\t\t",s.direction);
                Console.Write("{0}\t\t",s.credit);
                Console.Write("{0}\t",s.isGraduate);
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
