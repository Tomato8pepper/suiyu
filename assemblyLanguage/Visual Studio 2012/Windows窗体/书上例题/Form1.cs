using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 书上例题
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_MouseLeave(object sender, EventArgs e)
        {
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            label3.Text = "您所按得建是：" + e.KeyCode + "," + e.Modifiers;
        }

        private void Form1_MouseMove(object sender, MouseEventArgs e)
        {
            label1.Text = "当前鼠标的位置为：（" + e.X + "," + e.Y + ")";
        }

        private void Form1_MouseUp(object sender, MouseEventArgs e)
        {

        }

        private void Form1_MouseDown(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
                label2.Text = "鼠标按键是左键";
            else if (e.Button == MouseButtons.Right)
                label2.Text = "鼠标按键是右键";
            else if (e.Button == MouseButtons.Middle)
                label2.Text = "鼠标按键是中建";

        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
    }
}
