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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“telDBDataSet1.T_Conn”中。您可以根据需要移动或删除它。
            this.t_ConnTableAdapter.Fill(this.telDBDataSet1.T_Conn);
            // TODO: 这行代码将数据加载到表“telDBDataSet.T_Manage”中。您可以根据需要移动或删除它。
            this.t_ManageTableAdapter.Fill(this.telDBDataSet.T_Manage);
            string strcon = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=D:\BIANXHENG\Visual Studio 2012\通讯录管理系统\通讯录管理系统\TelDB.mdf;Integrated Security=True";
            string strsql = "select * from T_Conn";
            SqlDataAdapter d = new SqlDataAdapter(strsql, strcon);
            DataSet dt = new DataSet();
            d.Fill(dt);
            dataGridView1.DataSource = dt.Tables[0];
        }

        private void fillByToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.t_ManageTableAdapter.FillBy(this.telDBDataSet.T_Manage);
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }

        private void btnadd_Click(object sender, EventArgs e)
        {
            Form4 f = new Form4();
            f.ShowDialog();
        }

        private void btndelete_Click(object sender, EventArgs e)
        {
            Form5 f = new Form5();
            f.ShowDialog();

        }

        private void btnupdate_Click(object sender, EventArgs e)
        {

        }

        private void Form2_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
