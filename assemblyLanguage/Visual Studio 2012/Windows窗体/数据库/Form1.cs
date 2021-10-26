using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;//引入命名空间

namespace 数据库
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void butcancel_Click(object sender, EventArgs e)
        {
            this.txtname .Text= " ";
            this.numericUpDown1.Value = 10;
            this.radmale.Checked = true;
            this.txtbirthday.Text = "";
        }

        private void butsave_Click(object sender, EventArgs e)
        {
            if (this.txtname.Text == "")
            {
                MessageBox.Show("请输入姓名");
                this.txtname.Focus();
                return;
            }
            if(this.txtbirthday.Text=="")
            {
                MessageBox.Show("请输入出生日期：");
                this.txtbirthday.Focus();
                return;
            }
            string name = this.txtname.Text;
            int age = Convert.ToInt32(this.numericUpDown1.Value);
            string sex= this.radmale.Checked ? "男" : "女";
            string birthday = this.txtbirthday.Text;
            try
            {
                string sql = string.Format("insert into users values('{0}',{1},'{2}','{3}')", name, age, sex, birthday);//sql语句；
                SqlCommand cmd = new SqlCommand(sql, DBHelper.con);   //创建command对象
                DBHelper.con.Open();         //打开连接
                int result = cmd.ExecuteNonQuery(); //返回受影响的行数
                if (result > 0)
                {
                    MessageBox.Show("成功");
                    Frmshow f = new Frmshow();
                    f.Show();
                }
                else
                {
                    MessageBox.Show("失败");
                }

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                DBHelper.con.Close();
            }
        }
    }
}
//Command对象的常用方法：
     //属性：CommandText（获取sql语句）和Connection（获取connect对象）；
     //方法：ExecuteNonQuery(执行sql语句并返回受影响的行数）ExecuteReader();ExcuteScalar();
