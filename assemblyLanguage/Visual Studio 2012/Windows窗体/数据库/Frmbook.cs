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
namespace 数据库
{
    public partial class Frmbook : Form
    {
        public Frmbook()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void butsave_Click(object sender, EventArgs e)
        {
            if (this.txtname.Text == "")
            {
                MessageBox.Show("请输入书名");
                this.txtname.Focus();
                return;
            }
            if (this.txtprice.Text == "")
            {
                MessageBox.Show("请输入价格");
                this.txtprice.Focus();
                return;
            }
            if (this.txtstory.Text == "")
            {
                MessageBox.Show("请输入库存");
                this.txtstory.Focus();
                return;
            }
            try
            {
                string bookname = this.txtname.Text;
                double price = Convert.ToDouble(this.txtprice.Text);
                int num = Convert.ToInt32(this.txtstory.Text);
                string publisher = this.cobpublish.Text;
                string sql = string.Format("insert into book values('{0}',{1},{2},'{3}')", bookname, price, num, publisher);
                DBHelper.opendb();
                SqlCommand cmd = new SqlCommand(sql, DBHelper.con);
                int result = cmd.ExecuteNonQuery();
                if (result > 0)
                {
                    MessageBox.Show("成功");
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
                DBHelper.closedb();
            }
        }
        private void butreset_Click(object sender, EventArgs e)
        {
            txtname.Text = "";
            txtprice.Text = "";
            txtstory.Text = "";
            cobpublish.Text = "东华理工大学";
        }
        private void butdelete_Click(object sender, EventArgs e)
        {
            try
            {
                string bookname = this.txtname.Text;
                string sql = string.Format("delete book where bookname='{0}'", bookname);
                DBHelper.opendb();
                SqlCommand cmd = new SqlCommand(sql, DBHelper.con);
                int result = cmd.ExecuteNonQuery();
                if (result > 0)
                {
                    MessageBox.Show("成功");
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
                DBHelper.closedb();
            }
        }
        private void butupdate_Click(object sender, EventArgs e)
        {
            try
            {
                string bookname = this.txtname.Text;
                double price = Convert.ToDouble(this.txtprice.Text);
                int num = Convert.ToInt32(this.txtstory.Text);
                string publisher = this.cobpublish.Text;
                string sql = string.Format("update book set price={0},num={1},publisher='{2}' where bookname='{3}'", price, num, publisher ,bookname);
                DBHelper.opendb();
                SqlCommand cmd = new SqlCommand(sql, DBHelper.con);
                int result = cmd.ExecuteNonQuery();
                if (result > 0)
                {
                    MessageBox.Show("成功");
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
                DBHelper.closedb();
            }
        }
    }
}
