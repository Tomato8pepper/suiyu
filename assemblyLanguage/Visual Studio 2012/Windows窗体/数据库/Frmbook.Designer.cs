namespace 数据库
{
    partial class Frmbook
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblname = new System.Windows.Forms.Label();
            this.txtname = new System.Windows.Forms.TextBox();
            this.lblprice = new System.Windows.Forms.Label();
            this.lalstory = new System.Windows.Forms.Label();
            this.lalpublish = new System.Windows.Forms.Label();
            this.txtprice = new System.Windows.Forms.TextBox();
            this.txtstory = new System.Windows.Forms.TextBox();
            this.cobpublish = new System.Windows.Forms.ComboBox();
            this.butsave = new System.Windows.Forms.Button();
            this.butreset = new System.Windows.Forms.Button();
            this.butdelete = new System.Windows.Forms.Button();
            this.butupdate = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblname
            // 
            this.lblname.AutoSize = true;
            this.lblname.Location = new System.Drawing.Point(67, 56);
            this.lblname.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblname.Name = "lblname";
            this.lblname.Size = new System.Drawing.Size(51, 20);
            this.lblname.TabIndex = 0;
            this.lblname.Text = "书名";
            // 
            // txtname
            // 
            this.txtname.Font = new System.Drawing.Font("宋体", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.txtname.Location = new System.Drawing.Point(158, 53);
            this.txtname.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtname.Name = "txtname";
            this.txtname.Size = new System.Drawing.Size(136, 30);
            this.txtname.TabIndex = 1;
            this.txtname.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // lblprice
            // 
            this.lblprice.AutoSize = true;
            this.lblprice.Location = new System.Drawing.Point(67, 123);
            this.lblprice.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblprice.Name = "lblprice";
            this.lblprice.Size = new System.Drawing.Size(51, 20);
            this.lblprice.TabIndex = 0;
            this.lblprice.Text = "价格";
            // 
            // lalstory
            // 
            this.lalstory.AutoSize = true;
            this.lalstory.Location = new System.Drawing.Point(67, 192);
            this.lalstory.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lalstory.Name = "lalstory";
            this.lalstory.Size = new System.Drawing.Size(51, 20);
            this.lalstory.TabIndex = 0;
            this.lalstory.Text = "库存";
            // 
            // lalpublish
            // 
            this.lalpublish.AutoSize = true;
            this.lalpublish.Location = new System.Drawing.Point(46, 270);
            this.lalpublish.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lalpublish.Name = "lalpublish";
            this.lalpublish.Size = new System.Drawing.Size(72, 20);
            this.lalpublish.TabIndex = 0;
            this.lalpublish.Text = "出版社";
            // 
            // txtprice
            // 
            this.txtprice.Location = new System.Drawing.Point(158, 120);
            this.txtprice.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtprice.Name = "txtprice";
            this.txtprice.Size = new System.Drawing.Size(136, 30);
            this.txtprice.TabIndex = 2;
            this.txtprice.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // txtstory
            // 
            this.txtstory.Location = new System.Drawing.Point(158, 189);
            this.txtstory.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtstory.Name = "txtstory";
            this.txtstory.Size = new System.Drawing.Size(136, 30);
            this.txtstory.TabIndex = 3;
            this.txtstory.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // cobpublish
            // 
            this.cobpublish.FormattingEnabled = true;
            this.cobpublish.Items.AddRange(new object[] {
            "东华理工大学",
            "江西理工大学",
            "南昌大学",
            "江西师范大学",
            "江西财经大学"});
            this.cobpublish.Location = new System.Drawing.Point(158, 267);
            this.cobpublish.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.cobpublish.Name = "cobpublish";
            this.cobpublish.Size = new System.Drawing.Size(165, 28);
            this.cobpublish.TabIndex = 4;
            this.cobpublish.Text = "东华理工大学";
            // 
            // butsave
            // 
            this.butsave.Location = new System.Drawing.Point(50, 357);
            this.butsave.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.butsave.Name = "butsave";
            this.butsave.Size = new System.Drawing.Size(103, 31);
            this.butsave.TabIndex = 5;
            this.butsave.Text = "保存";
            this.butsave.UseVisualStyleBackColor = true;
            this.butsave.Click += new System.EventHandler(this.butsave_Click);
            // 
            // butreset
            // 
            this.butreset.Location = new System.Drawing.Point(323, 357);
            this.butreset.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.butreset.Name = "butreset";
            this.butreset.Size = new System.Drawing.Size(103, 31);
            this.butreset.TabIndex = 6;
            this.butreset.Text = "重置";
            this.butreset.UseVisualStyleBackColor = true;
            this.butreset.Click += new System.EventHandler(this.butreset_Click);
            // 
            // butdelete
            // 
            this.butdelete.Location = new System.Drawing.Point(191, 357);
            this.butdelete.Margin = new System.Windows.Forms.Padding(4);
            this.butdelete.Name = "butdelete";
            this.butdelete.Size = new System.Drawing.Size(103, 31);
            this.butdelete.TabIndex = 5;
            this.butdelete.Text = "删除";
            this.butdelete.UseVisualStyleBackColor = true;
            this.butdelete.Click += new System.EventHandler(this.butdelete_Click);
            // 
            // butupdate
            // 
            this.butupdate.Location = new System.Drawing.Point(344, 120);
            this.butupdate.Margin = new System.Windows.Forms.Padding(4);
            this.butupdate.Name = "butupdate";
            this.butupdate.Size = new System.Drawing.Size(103, 31);
            this.butupdate.TabIndex = 5;
            this.butupdate.Text = "修改";
            this.butupdate.UseVisualStyleBackColor = true;
            this.butupdate.Click += new System.EventHandler(this.butupdate_Click);
            // 
            // Frmbook
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(471, 454);
            this.Controls.Add(this.butreset);
            this.Controls.Add(this.butupdate);
            this.Controls.Add(this.butdelete);
            this.Controls.Add(this.butsave);
            this.Controls.Add(this.cobpublish);
            this.Controls.Add(this.txtstory);
            this.Controls.Add(this.txtprice);
            this.Controls.Add(this.txtname);
            this.Controls.Add(this.lalpublish);
            this.Controls.Add(this.lalstory);
            this.Controls.Add(this.lblprice);
            this.Controls.Add(this.lblname);
            this.Font = new System.Drawing.Font("宋体", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "Frmbook";
            this.Text = "添加图书";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblname;
        private System.Windows.Forms.TextBox txtname;
        private System.Windows.Forms.Label lblprice;
        private System.Windows.Forms.Label lalstory;
        private System.Windows.Forms.Label lalpublish;
        private System.Windows.Forms.TextBox txtprice;
        private System.Windows.Forms.TextBox txtstory;
        private System.Windows.Forms.ComboBox cobpublish;
        private System.Windows.Forms.Button butsave;
        private System.Windows.Forms.Button butreset;
        private System.Windows.Forms.Button butdelete;
        private System.Windows.Forms.Button butupdate;
    }
}