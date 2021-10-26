using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 实验一
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int a;
        private void Form1_Load(object sender, EventArgs e)
        {
            Random m = new Random();
            int m1=m.Next(0, 6);
            a = Convert.ToInt32(m1);
        }

        private void label2_Click(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
            if (textBox2.Text == null)
                MessageBox.Show("请输入一个数");
            int n = Convert.ToInt32(textBox2.Text);
            if (a == n)
            {
                MessageBox.Show("恭喜您猜对了");
            }
            else
            {
                MessageBox.Show("您猜错了，请重新输入");
            }

        }
    }
}
