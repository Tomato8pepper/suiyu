using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 装箱拆箱
{
    public class Sample
    {
        public int i;
    }
    public class MainClass
    {
         public static void Test(object o)
        {
        if(o.GetType ()==typeof (double ))
            Console .WriteLine ("{0}这是一个实数，与100相加后得到：{1}",o,((double )o+100));
        if(o.GetType ()==typeof(Sample))
            Sample new_b=(Sample)o;
            Console .WriteLine ("这是一个Sample类型的对象，该对象的属性i的值是："+new_b,i);
        if(o.GetType ()==typeof (int ))
            Console.WriteLine ("{0}是一个整数，与3相乘后得到：{1}",o,((int)o*3));
        }
    }
    class Program
    {
        static void Main()
        {
            /*装箱： int val = 100;
            object obj = val;*/
            /*拆箱： int val = 100;
            object obj = val;
            int num = (int)obj;*/
            double a = 1.23;
            Test(a);
            Sample b = new Sample();
            b.i = 20;
            Test(b);
            object c = 100;
            Test(c);

        }
    }
}

