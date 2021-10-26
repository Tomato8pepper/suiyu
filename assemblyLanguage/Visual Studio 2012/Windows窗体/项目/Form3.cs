using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 项目
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string dataTime = comboBox1.Text;
            switch (dataTime)
            {
                case"当前月份":
                    listBox1.Items.Clear();
                    listBox1.Items.Add("2018-01-25");
                    listBox1.Items.Add("2018-02-25");
                    listBox1.Items.Add("2018-03-25");
                    break;
                case"前一个月":
                     listBox1.Items.Clear();
                    listBox1.Items.Add("2018-01-25");
                    listBox1.Items.Add("2018-02-25");
                    listBox1.Items.Add("2018-03-25");
                    break;
                default:
                    listBox1.Items.Clear();
                    listBox1.Items.Add("2018-01-25");
                    listBox1.Items.Add("2018-02-25");
                    listBox1.Items.Add("2018-03-25");
                    listBox1.Items.Add("2018-04-25");
                    listBox1.Items.Add("2018-05-25");
                    listBox1.Items.Add("2018-06-25");
                    break;
            }
            this.label3.Visible=true;
            this.listBox1.Visible=true;
        }

        private void Form3_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            Form4 f = new Form4();
            f.Show();

        }

        private void Form3_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();//叉叉可以退出；
        }

    }
}
