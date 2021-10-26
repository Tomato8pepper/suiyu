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
    public partial class Formb : Form
    {
        public string name;
        public string phone;
        public string address;
        public string sex;
        public string desig;
        public string depart;
        public Formb()
        {
            InitializeComponent();
        }

        private void Formb_Load(object sender, EventArgs e)
        {
            this.textBox1.AppendText(name + "\n");
            this.textBox1.AppendText(phone + "\n");
            this.textBox1.AppendText(address + "\n");
            this.textBox1.AppendText(sex + "\n");
            this.textBox1.AppendText(desig + "\n");
            this.textBox1.AppendText(depart + "\n");
           

        }

        private void Formb_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
