namespace 数据库
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
            this.lblname = new System.Windows.Forms.Label();
            this.lblage = new System.Windows.Forms.Label();
            this.lblsex = new System.Windows.Forms.Label();
            this.lblbirthday = new System.Windows.Forms.Label();
            this.txtname = new System.Windows.Forms.TextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.radmale = new System.Windows.Forms.RadioButton();
            this.radfemale = new System.Windows.Forms.RadioButton();
            this.numericUpDown1 = new System.Windows.Forms.NumericUpDown();
            this.txtbirthday = new System.Windows.Forms.TextBox();
            this.butsave = new System.Windows.Forms.Button();
            this.butcancel = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).BeginInit();
            this.SuspendLayout();
            // 
            // lblname
            // 
            this.lblname.AutoSize = true;
            this.lblname.Location = new System.Drawing.Point(99, 34);
            this.lblname.Name = "lblname";
            this.lblname.Size = new System.Drawing.Size(72, 20);
            this.lblname.TabIndex = 0;
            this.lblname.Text = "姓名：";
            // 
            // lblage
            // 
            this.lblage.AutoSize = true;
            this.lblage.Location = new System.Drawing.Point(99, 102);
            this.lblage.Name = "lblage";
            this.lblage.Size = new System.Drawing.Size(72, 20);
            this.lblage.TabIndex = 0;
            this.lblage.Text = "年龄：";
            // 
            // lblsex
            // 
            this.lblsex.AutoSize = true;
            this.lblsex.Location = new System.Drawing.Point(99, 178);
            this.lblsex.Name = "lblsex";
            this.lblsex.Size = new System.Drawing.Size(72, 20);
            this.lblsex.TabIndex = 0;
            this.lblsex.Text = "性别：";
            // 
            // lblbirthday
            // 
            this.lblbirthday.AutoSize = true;
            this.lblbirthday.Location = new System.Drawing.Point(57, 259);
            this.lblbirthday.Name = "lblbirthday";
            this.lblbirthday.Size = new System.Drawing.Size(114, 20);
            this.lblbirthday.TabIndex = 0;
            this.lblbirthday.Text = "出生日期：";
            // 
            // txtname
            // 
            this.txtname.Location = new System.Drawing.Point(193, 34);
            this.txtname.Name = "txtname";
            this.txtname.Size = new System.Drawing.Size(192, 30);
            this.txtname.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.radfemale);
            this.groupBox1.Controls.Add(this.radmale);
            this.groupBox1.Location = new System.Drawing.Point(162, 156);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(335, 75);
            this.groupBox1.TabIndex = 4;
            this.groupBox1.TabStop = false;
            // 
            // radmale
            // 
            this.radmale.AutoSize = true;
            this.radmale.Checked = true;
            this.radmale.Location = new System.Drawing.Point(15, 22);
            this.radmale.Name = "radmale";
            this.radmale.Size = new System.Drawing.Size(51, 24);
            this.radmale.TabIndex = 0;
            this.radmale.TabStop = true;
            this.radmale.Text = "男";
            this.radmale.UseVisualStyleBackColor = true;
            // 
            // radfemale
            // 
            this.radfemale.AutoSize = true;
            this.radfemale.Location = new System.Drawing.Point(173, 22);
            this.radfemale.Name = "radfemale";
            this.radfemale.Size = new System.Drawing.Size(51, 24);
            this.radfemale.TabIndex = 0;
            this.radfemale.Text = "女";
            this.radfemale.UseVisualStyleBackColor = true;
            // 
            // numericUpDown1
            // 
            this.numericUpDown1.Location = new System.Drawing.Point(193, 102);
            this.numericUpDown1.Name = "numericUpDown1";
            this.numericUpDown1.Size = new System.Drawing.Size(193, 30);
            this.numericUpDown1.TabIndex = 5;
            this.numericUpDown1.Value = new decimal(new int[] {
            10,
            0,
            0,
            0});
            // 
            // txtbirthday
            // 
            this.txtbirthday.Location = new System.Drawing.Point(193, 256);
            this.txtbirthday.Name = "txtbirthday";
            this.txtbirthday.Size = new System.Drawing.Size(224, 30);
            this.txtbirthday.TabIndex = 6;
            // 
            // butsave
            // 
            this.butsave.Location = new System.Drawing.Point(132, 317);
            this.butsave.Name = "butsave";
            this.butsave.Size = new System.Drawing.Size(75, 38);
            this.butsave.TabIndex = 7;
            this.butsave.Text = "添加";
            this.butsave.UseVisualStyleBackColor = true;
            this.butsave.Click += new System.EventHandler(this.butsave_Click);
            // 
            // butcancel
            // 
            this.butcancel.Location = new System.Drawing.Point(310, 317);
            this.butcancel.Name = "butcancel";
            this.butcancel.Size = new System.Drawing.Size(75, 38);
            this.butcancel.TabIndex = 7;
            this.butcancel.Text = "重置";
            this.butcancel.UseVisualStyleBackColor = true;
            this.butcancel.Click += new System.EventHandler(this.butcancel_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(526, 367);
            this.Controls.Add(this.butcancel);
            this.Controls.Add(this.butsave);
            this.Controls.Add(this.txtbirthday);
            this.Controls.Add(this.numericUpDown1);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.txtname);
            this.Controls.Add(this.lblbirthday);
            this.Controls.Add(this.lblsex);
            this.Controls.Add(this.lblage);
            this.Controls.Add(this.lblname);
            this.Font = new System.Drawing.Font("宋体", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "Form1";
            this.Text = "Form1";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblname;
        private System.Windows.Forms.Label lblage;
        private System.Windows.Forms.Label lblsex;
        private System.Windows.Forms.Label lblbirthday;
        private System.Windows.Forms.TextBox txtname;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton radfemale;
        private System.Windows.Forms.RadioButton radmale;
        private System.Windows.Forms.NumericUpDown numericUpDown1;
        private System.Windows.Forms.TextBox txtbirthday;
        private System.Windows.Forms.Button butsave;
        private System.Windows.Forms.Button butcancel;
    }
}

