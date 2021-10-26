using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;  //引入空间
namespace 数据库
{
    public partial class Frmshow : Form
    {
        public Frmshow()
        {
            InitializeComponent();
        }
        DataSet  ds=new DataSet();//定义显示数据集
        SqlDataAdapter da;   //定义sql数据集
        private void Frmshow_Load(object sender, EventArgs e)
        {
            string sql = "select * from users";
            da = new SqlDataAdapter(sql, DBHelper.con);
            da.Fill(ds, "users");//填充
            dgvshow.DataSource = ds.Tables["users"];  //控件显示数据
            
        }

        private void Frmshow_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
