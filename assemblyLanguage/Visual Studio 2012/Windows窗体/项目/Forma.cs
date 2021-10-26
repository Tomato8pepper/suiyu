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
    public partial class Forma : Form
    {
        public Forma()
        {
            InitializeComponent();
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Enabled = true;
            textBox2.Enabled = true;
            textBox3.Enabled = true;
            comboBox1.Enabled = true;
            radioButton1.Enabled = true;
            radioButton2.Enabled = true;
        }

        private void Forma_Load(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            comboBox1.Text = "经理";
            radioButton1.Checked = true;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string str = "";
            for (int ctr = 0; ctr <= this.listBox1.SelectedItems.Count - 1; ctr++)
            {
                str += "\r\n" + this.listBox1.SelectedItems[ctr].ToString();
            }
            MessageBox.Show("选定项"+str);
            Application.Exit();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            MessageBox.Show("你选择了"+comboBox1.SelectedItem .ToString());
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Formb f = new Formb();
            f.name = textBox1.Text;
            f.phone = textBox2.Text;
            f.address = textBox3.Text;
            f.sex = radioButton1.Checked ? "男" : "女";
            f.desig = comboBox1.Text;
            string str = "";
            for (int ctr = 0; ctr <= this.listBox1.SelectedItems.Count - 1; ctr++)
            {
                str += "\r\n" + this.listBox1.SelectedItems[ctr].ToString();
            }
            f.depart = str;
            f.Show();
            this.Hide();
        }
    }
}
