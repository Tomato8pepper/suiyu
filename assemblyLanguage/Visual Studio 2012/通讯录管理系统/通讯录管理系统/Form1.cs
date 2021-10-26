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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void btnload_Click(object sender, EventArgs e)
        {
            string connstr=@"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
            string sqlstr = "select count(*) from T_User where Id=@id and password=@pwd";
            using (SqlConnection conn=new SqlConnection(connstr))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand(sqlstr, conn);
                    SqlParameter p = new SqlParameter("@id", textBox1.Text);
                    cmd.Parameters.Add(p);
                    cmd.Parameters.Add("@pwd", SqlDbType.NVarChar).Value = textBox2.Text;
                    conn.Open();
                    if ((int)cmd.ExecuteScalar() > 0)
                    {
                        MessageBox.Show("登陆成功");
                        Form2 f = new Form2();
                        f.Show();
                        this.Hide();
                        conn.Close();
                    }
                    else
                        MessageBox.Show("登录失败");
                }
                catch (Exception ex){
                    MessageBox.Show(ex.Message);
                }            
            }
        }
        private void button2_Click(object sender, EventArgs e)
        {
            string connstr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
            string sqlstr = "select count(*) from T_Manage where Id=@id and serect=@pwd";
            using (SqlConnection conn = new SqlConnection(connstr))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand(sqlstr, conn);
                    SqlParameter p = new SqlParameter("@id", textBox4.Text);
                    cmd.Parameters.Add(p);
                    cmd.Parameters.Add("@pwd", SqlDbType.NVarChar).Value = textBox3.Text;
                    conn.Open();
                    if ((int)cmd.ExecuteScalar() > 0)
                    {
                        MessageBox.Show("登陆成功");
                        Form3 f = new Form3();
                        f.Show();
                        this.Hide();
                        conn.Close();
                    }

                    else
                        MessageBox.Show("登录失败");
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text ="";
            textBox2.Text = "";
        }
        private void btnce_Click(object sender, EventArgs e)
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
                    MessageBox.Show("注册成功");
                    textBox1.Text = "";
                    textBox2.Text = "";
                }
                else
                    MessageBox.Show("注册失败");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            try
            {
                string connstr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
                string sqlstr = string.Format("insert into T_Manage values({0},{1})", textBox4.Text, textBox3.Text);
                SqlConnection conn = new SqlConnection(connstr);
                SqlCommand cmd = new SqlCommand(sqlstr, conn);
                conn.Open();
                if ((int)cmd.ExecuteNonQuery() > 0)
                {
                    MessageBox.Show("注册成功");
                    textBox3.Text = "";
                    textBox4.Text = "";
                }
                else
                    MessageBox.Show("注册失败");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox4.Text = "";
            textBox3.Text = "";
        }
    }
}
