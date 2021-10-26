using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace 项目实训
{
    class Program
    {
        static int [,]a={{0,0,1,0,0,0,1,0},{0,0,1,0,0,0,1,0},{0,0,0,0,1,1,0,0},{0,1,1,1,0,0,0,0},{0,0,0,1,0,0,0,0},{0,1,0,0,0,1,0,0},{0,1,1,1,0,1,1,0},{1,1,0,0,0,0,0,0}};
        static bool stepdown(int i, int j)
        {
            i++;
            if (i >= 8)
                return false;
            if (a[i, j] == 0)
                return true;
            return false;
        }
        static bool stepright(int i,int j)
        {
            j++;
            if (j >= 8)
                return false;
            if (a[i, j] == 0)
                return true;
            return false;
        }
        static bool stepup(int i,int j)
        {
            i--;
            if (i< 0)
                return false;
            if (a[i, j] == 0)
                return true;
            return false;
        }
        static bool stepleft(int i,int j)
        {
            j++;
            if (j<0)
                return false;
            if (a[i, j] == 0)
                return true;
            return false;
        }
        static void migong(Stack<int> s)
        {
            int i = 0, j = 0, x;
            while (true)
            {
                if (a[i, j] == 0)
                {
                    s.Push((i + 1) * 10 + j + 1);
                    a[i, j] = 1;
                    if (s.Peek() == 88) return;
                }
                if (stepdown(i, j))
                    i++;
                else if (stepright(i, j))
                    j++;
                else if (stepup(i, j))
                    i--;
                else if (stepleft(i, j))
                    j--;
                else
                {
                    s.Pop();
                    x = s.Peek();
                    i = x / 10 - 1;
                    j = x % 10 - 1;
                }
            }
        }
            static void Main(string[] args)
        {
            Stack<int> s1 = new Stack<int>();
            Stack<int> s2 = new Stack<int>();
            int x = 0, n = 0;
            migong(s1);
            while (s1.Count != 0)
            {
                s2.Push(s1.Pop());
            }
            while (s2.Count != 0)
            {
                x = s2.Pop();
                Console.Write("{0}，{1}  ", x / 10, x % 10);
                if (++n % 5 == 0) Console.WriteLine("\n");
            }
            Console.Read();
        }
    }
}
