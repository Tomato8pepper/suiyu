using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace example2_2
{
    class Sample
    {
        public int i;
    }
    class Program
    {
        static void Test(object o)
        {
            if(o.GetType ()==typeof (double ))
                Console.WriteLine("{0}是一个实数，与100相加后得到：{1}",o,((double)o+100));
        static void Main(string[] args)
        {
        }
    }
}
