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
    public partial class Form7 : Form
    {
        public Form7()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                string connstr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
                string sqlstr = string.Format("delete T_User where Id={0}", textBox1.Text);
                SqlConnection conn = new SqlConnection(connstr);
                SqlCommand cmd = new SqlCommand(sqlstr, conn);
                conn.Open();
                if ((int)cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("删除成功");
                }
                else
                    MessageBox.Show("删除失败");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
