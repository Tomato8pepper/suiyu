using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 通讯录管理系统
{
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“telDBDataSet5.T_User”中。您可以根据需要移动或删除它。
            this.t_UserTableAdapter1.Fill(this.telDBDataSet5.T_User);
            // TODO: 这行代码将数据加载到表“telDBDataSet4.T_Conn”中。您可以根据需要移动或删除它。
            this.t_ConnTableAdapter1.Fill(this.telDBDataSet4.T_Conn);
            // TODO: 这行代码将数据加载到表“telDBDataSet3.T_User”中。您可以根据需要移动或删除它。
            this.t_UserTableAdapter.Fill(this.telDBDataSet3.T_User);
            // TODO: 这行代码将数据加载到表“telDBDataSet2.T_Conn”中。您可以根据需要移动或删除它。
            this.t_ConnTableAdapter.Fill(this.telDBDataSet2.T_Conn);

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form6 f = new Form6();
            f.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Form7 f = new Form7();
            f.ShowDialog();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            Form4 f = new Form4();
            f.ShowDialog();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form5 f = new Form5();
            f.ShowDialog();
        }

        private void Form3_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
