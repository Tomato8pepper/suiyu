using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 枚举
{
    public enum SolarSystem    //第一个元素默认为零，值类型出char以外，default为int;
    {
        Sun = 693600, Earth = 6380, Moon = 1740
    }

    class Program
    {
        static void Main(string[] args)
        {
            SolarSystem sun = SolarSystem.Sun;
            SolarSystem earth = SolarSystem.Earth;
            SolarSystem moon = SolarSystem.Moon;
            Console.WriteLine("太阳系的体积为：" + 4 / 3 * 3.14 * Math.Pow((int)sun, 3));
            Console.WriteLine("地球体积为：" + 4 / 3 * 3.14 * Math.Pow((int)earth, 3));
            Console.WriteLine("月亮体积为：" + 4 / 3 * 3.14 * Math.Pow((int)moon, 3));
            Console.ReadKey();

        }
    }
}
