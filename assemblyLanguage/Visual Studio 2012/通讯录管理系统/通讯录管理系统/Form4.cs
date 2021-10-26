using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
namespace 通讯录管理系统
{
    public partial class Form4 : Form
    {
        public Form4()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                string connstr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
                string sqlstr = string.Format("insert into T_Conn values({0},'{1}','{2}',{3},'{4}')", textBox6.Text, textBox7.Text, textBox8.Text, textBox9.Text, textBox10.Text);
                SqlConnection conn = new SqlConnection(connstr);
                SqlCommand cmd = new SqlCommand(sqlstr, conn);
                conn.Open();
                if ((int)cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("添加成功");
                    textBox10.Text = "";
                    textBox9.Text = "";
                    textBox8.Text = "";
                    textBox7.Text = "";
                    textBox6.Text = "";
                    conn.Close();
                }
                else
                    MessageBox.Show("添加失败");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox10.Text = "";
            textBox9.Text = "";
            textBox8.Text = "";
            textBox7.Text = "";
            textBox6.Text = "";
        }
    }
}
