using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace 项目实训3_1
{
    class Student
    {
        string name, grade, number;
        public string Number
        {
            get { return number; }
            set { number = value; }
        }

        public string Grade
        {
            get { return grade; }
            set { grade = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }
        double age;

        public double Age
        {
            get { return age; }
            set { age = value; }
        }
        public Student() 
        {
            Name= "查";
            Grade = "1";
            Number = "01";
            Age = 90;
        }
        public Student(string na, string g, string n, double a)
        {
            Name = na;
            Grade = g;
            Number = n;
            Age = a;
        }
        public double avg(double s)
        {
            double avg = s / 10.0;
            return avg;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Student[] a= new Student[10];
            double sum = 0;
            
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("请依次输入姓名，年龄，班级，学号");
                string name1=Convert.ToString( Console.ReadLine());
                string grade1=Convert.ToString( Console.ReadLine());
                string number1=Convert.ToString( Console.ReadLine());
                double age1=Convert.ToDouble(Console.ReadLine());
                a[i]= new Student(name1, grade1, number1, age1);
            }
            for(int i=0;i<10;i++)
            {
                double m=a[i].Age;
                sum = sum + m;
            }
            Student s1 = new Student();
            double avg=s1.avg(sum);
            Console.WriteLine("平均年龄是：{0}", avg);
            Console.ReadKey();
        }
    }
}
