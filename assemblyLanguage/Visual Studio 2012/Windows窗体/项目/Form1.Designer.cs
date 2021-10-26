namespace 项目
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.groupzhuce = new System.Windows.Forms.GroupBox();
            this.textBox5 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.labquerenmima = new System.Windows.Forms.Label();
            this.labyonghu = new System.Windows.Forms.Label();
            this.labmima = new System.Windows.Forms.Label();
            this.groupjibenxinxi = new System.Windows.Forms.GroupBox();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.numericUpDown1 = new System.Windows.Forms.NumericUpDown();
            this.textBox4 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.labzhuzhi = new System.Windows.Forms.Label();
            this.groupzhuangtai = new System.Windows.Forms.GroupBox();
            this.radionv = new System.Windows.Forms.RadioButton();
            this.radionan = new System.Windows.Forms.RadioButton();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.groupzhuce.SuspendLayout();
            this.groupjibenxinxi.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).BeginInit();
            this.groupzhuangtai.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // groupzhuce
            // 
            this.groupzhuce.Controls.Add(this.textBox5);
            this.groupzhuce.Controls.Add(this.textBox3);
            this.groupzhuce.Controls.Add(this.textBox2);
            this.groupzhuce.Controls.Add(this.textBox1);
            this.groupzhuce.Controls.Add(this.labquerenmima);
            this.groupzhuce.Controls.Add(this.labyonghu);
            this.groupzhuce.Controls.Add(this.labmima);
            this.groupzhuce.Location = new System.Drawing.Point(16, 16);
            this.groupzhuce.Margin = new System.Windows.Forms.Padding(4);
            this.groupzhuce.Name = "groupzhuce";
            this.groupzhuce.Padding = new System.Windows.Forms.Padding(4);
            this.groupzhuce.Size = new System.Drawing.Size(587, 216);
            this.groupzhuce.TabIndex = 4;
            this.groupzhuce.TabStop = false;
            this.groupzhuce.Text = "用户注册信息";
            // 
            // textBox5
            // 
            this.textBox5.Location = new System.Drawing.Point(160, 467);
            this.textBox5.Margin = new System.Windows.Forms.Padding(4);
            this.textBox5.Multiline = true;
            this.textBox5.Name = "textBox5";
            this.textBox5.Size = new System.Drawing.Size(362, 86);
            this.textBox5.TabIndex = 1;
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(172, 137);
            this.textBox3.Margin = new System.Windows.Forms.Padding(4);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(362, 30);
            this.textBox3.TabIndex = 3;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(172, 84);
            this.textBox2.Margin = new System.Windows.Forms.Padding(4);
            this.textBox2.Name = "textBox2";
            this.textBox2.PasswordChar = '·';
            this.textBox2.Size = new System.Drawing.Size(362, 30);
            this.textBox2.TabIndex = 2;
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(172, 32);
            this.textBox1.Margin = new System.Windows.Forms.Padding(4);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(362, 30);
            this.textBox1.TabIndex = 1;
            // 
            // labquerenmima
            // 
            this.labquerenmima.AutoSize = true;
            this.labquerenmima.Location = new System.Drawing.Point(63, 140);
            this.labquerenmima.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.labquerenmima.Name = "labquerenmima";
            this.labquerenmima.Size = new System.Drawing.Size(114, 20);
            this.labquerenmima.TabIndex = 0;
            this.labquerenmima.Text = "确认密码：";
            // 
            // labyonghu
            // 
            this.labyonghu.AutoSize = true;
            this.labyonghu.Location = new System.Drawing.Point(82, 35);
            this.labyonghu.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.labyonghu.Name = "labyonghu";
            this.labyonghu.Size = new System.Drawing.Size(93, 20);
            this.labyonghu.TabIndex = 0;
            this.labyonghu.Text = "用户名：";
            // 
            // labmima
            // 
            this.labmima.AutoSize = true;
            this.labmima.Location = new System.Drawing.Point(104, 87);
            this.labmima.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.labmima.Name = "labmima";
            this.labmima.Size = new System.Drawing.Size(72, 20);
            this.labmima.TabIndex = 0;
            this.labmima.Text = "密码：";
            this.labmima.Click += new System.EventHandler(this.label3_Click);
            // 
            // groupjibenxinxi
            // 
            this.groupjibenxinxi.Controls.Add(this.comboBox1);
            this.groupjibenxinxi.Controls.Add(this.numericUpDown1);
            this.groupjibenxinxi.Controls.Add(this.textBox4);
            this.groupjibenxinxi.Controls.Add(this.pictureBox1);
            this.groupjibenxinxi.Controls.Add(this.label2);
            this.groupjibenxinxi.Controls.Add(this.label1);
            this.groupjibenxinxi.Controls.Add(this.labzhuzhi);
            this.groupjibenxinxi.Location = new System.Drawing.Point(16, 370);
            this.groupjibenxinxi.Margin = new System.Windows.Forms.Padding(4);
            this.groupjibenxinxi.Name = "groupjibenxinxi";
            this.groupjibenxinxi.Padding = new System.Windows.Forms.Padding(4);
            this.groupjibenxinxi.Size = new System.Drawing.Size(587, 257);
            this.groupjibenxinxi.TabIndex = 1;
            this.groupjibenxinxi.TabStop = false;
            this.groupjibenxinxi.Text = "用户基本信息";
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] {
            "大一",
            "大二",
            "大三",
            "大四"});
            this.comboBox1.Location = new System.Drawing.Point(300, 193);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(188, 28);
            this.comboBox1.TabIndex = 8;
            // 
            // numericUpDown1
            // 
            this.numericUpDown1.Location = new System.Drawing.Point(300, 132);
            this.numericUpDown1.Name = "numericUpDown1";
            this.numericUpDown1.Size = new System.Drawing.Size(279, 30);
            this.numericUpDown1.TabIndex = 7;
            // 
            // textBox4
            // 
            this.textBox4.Location = new System.Drawing.Point(300, 34);
            this.textBox4.Margin = new System.Windows.Forms.Padding(4);
            this.textBox4.Multiline = true;
            this.textBox4.Name = "textBox4";
            this.textBox4.Size = new System.Drawing.Size(279, 75);
            this.textBox4.TabIndex = 6;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(246, 195);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(72, 20);
            this.label2.TabIndex = 0;
            this.label2.Text = "年级：";
            this.label2.Click += new System.EventHandler(this.labzhuzhi_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(246, 136);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(72, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "年龄：";
            this.label1.Click += new System.EventHandler(this.labzhuzhi_Click);
            // 
            // labzhuzhi
            // 
            this.labzhuzhi.AutoSize = true;
            this.labzhuzhi.Location = new System.Drawing.Point(204, 33);
            this.labzhuzhi.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.labzhuzhi.Name = "labzhuzhi";
            this.labzhuzhi.Size = new System.Drawing.Size(114, 20);
            this.labzhuzhi.TabIndex = 0;
            this.labzhuzhi.Text = "家庭住址：";
            this.labzhuzhi.Click += new System.EventHandler(this.labzhuzhi_Click);
            // 
            // groupzhuangtai
            // 
            this.groupzhuangtai.Controls.Add(this.radionv);
            this.groupzhuangtai.Controls.Add(this.radionan);
            this.groupzhuangtai.Location = new System.Drawing.Point(16, 250);
            this.groupzhuangtai.Margin = new System.Windows.Forms.Padding(4);
            this.groupzhuangtai.Name = "groupzhuangtai";
            this.groupzhuangtai.Padding = new System.Windows.Forms.Padding(4);
            this.groupzhuangtai.Size = new System.Drawing.Size(587, 102);
            this.groupzhuangtai.TabIndex = 1;
            this.groupzhuangtai.TabStop = false;
            this.groupzhuangtai.Text = "状态";
            // 
            // radionv
            // 
            this.radionv.AutoSize = true;
            this.radionv.Location = new System.Drawing.Point(300, 41);
            this.radionv.Name = "radionv";
            this.radionv.Size = new System.Drawing.Size(51, 24);
            this.radionv.TabIndex = 0;
            this.radionv.Text = "女";
            this.radionv.UseVisualStyleBackColor = true;
            // 
            // radionan
            // 
            this.radionan.AutoSize = true;
            this.radionan.Checked = true;
            this.radionan.Location = new System.Drawing.Point(64, 41);
            this.radionan.Name = "radionan";
            this.radionan.Size = new System.Drawing.Size(51, 24);
            this.radionan.TabIndex = 5;
            this.radionan.TabStop = true;
            this.radionan.Text = "男";
            this.radionan.UseVisualStyleBackColor = true;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(148, 653);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 30);
            this.button1.TabIndex = 2;
            this.button1.Text = "保存(&A)";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(429, 653);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 30);
            this.button2.TabIndex = 2;
            this.button2.Text = "重置";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(248, 653);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(152, 30);
            this.button3.TabIndex = 2;
            this.button3.Text = "下一个界面";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::项目.Properties.Resources.t010c0a1893b1633d9c;
            this.pictureBox1.Location = new System.Drawing.Point(7, 30);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(200, 203);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(255)))));
            this.ClientSize = new System.Drawing.Size(629, 704);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupzhuangtai);
            this.Controls.Add(this.groupjibenxinxi);
            this.Controls.Add(this.groupzhuce);
            this.Font = new System.Drawing.Font("宋体", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.Text = "学员注册";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupzhuce.ResumeLayout(false);
            this.groupzhuce.PerformLayout();
            this.groupjibenxinxi.ResumeLayout(false);
            this.groupjibenxinxi.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).EndInit();
            this.groupzhuangtai.ResumeLayout(false);
            this.groupzhuangtai.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupzhuce;
        private System.Windows.Forms.Label labquerenmima;
        private System.Windows.Forms.Label labyonghu;
        private System.Windows.Forms.Label labmima;
        private System.Windows.Forms.TextBox textBox5;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.GroupBox groupjibenxinxi;
        private System.Windows.Forms.TextBox textBox4;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label labzhuzhi;
        private System.Windows.Forms.GroupBox groupzhuangtai;
        private System.Windows.Forms.RadioButton radionv;
        private System.Windows.Forms.RadioButton radionan;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.NumericUpDown numericUpDown1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
    }
}

