using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 异常
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b, c;
            try
            {
                a = Convert.ToInt32(Console.ReadLine());
                b = Convert.ToInt32(Console.ReadLine());
                c = a / b;
            }
            catch (FormatException)
            {
                Console.WriteLine("提示：输入格式错误！");
            }
            catch (DivideByZeroException)
            {
                Console.WriteLine("提示：除数不能为零！");
            }
            catch (Exception e)
            {
                Console.WriteLine("e.Message");
            }
            finally
            {
                Console.WriteLine("感谢使用本软件!");
            }
            Console.ReadKey();
        }
    }
}
