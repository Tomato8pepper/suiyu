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
namespace 通讯录管理系统1
{
    public partial class Form6 : Form
    {
        public Form6()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                string connstr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
                string sqlstr = string.Format("insert into T_User values({0},{1})", textBox1.Text, textBox2.Text);
                SqlConnection conn = new SqlConnection(connstr);
                SqlCommand cmd = new SqlCommand(sqlstr, conn);
                conn.Open();
                if ((int)cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("添加成功");
                    textBox1.Text = "";
                    textBox2.Text = "";
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
            textBox1.Text = "";
            textBox2.Text = "";
        }
    }
}
