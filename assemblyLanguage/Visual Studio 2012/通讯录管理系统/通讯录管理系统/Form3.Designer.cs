namespace 通讯录管理系统
{
    partial class Form3
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
            this.components = new System.ComponentModel.Container();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.button4 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.dataGridView2 = new System.Windows.Forms.DataGridView();
            this.idDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.passwordDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tUserBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.telDBDataSet5 = new 通讯录管理系统.TelDBDataSet5();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.label4 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.button6 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.idDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.sexDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ageDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.phoneDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tConnBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.telDBDataSet4 = new 通讯录管理系统.TelDBDataSet4();
            this.telDBDataSet1 = new 通讯录管理系统.TelDBDataSet1();
            this.telDBDataSet1BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.telDBDataSet2 = new 通讯录管理系统.TelDBDataSet2();
            this.tConnBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.t_ConnTableAdapter = new 通讯录管理系统.TelDBDataSet2TableAdapters.T_ConnTableAdapter();
            this.telDBDataSet3 = new 通讯录管理系统.TelDBDataSet3();
            this.tUserBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.t_UserTableAdapter = new 通讯录管理系统.TelDBDataSet3TableAdapters.T_UserTableAdapter();
            this.t_ConnTableAdapter1 = new 通讯录管理系统.TelDBDataSet4TableAdapters.T_ConnTableAdapter();
            this.t_UserTableAdapter1 = new 通讯录管理系统.TelDBDataSet5TableAdapters.T_UserTableAdapter();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tUserBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet5)).BeginInit();
            this.tabPage2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tConnBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet4)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet1BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tConnBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tUserBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Location = new System.Drawing.Point(0, 0);
            this.tabControl1.Margin = new System.Windows.Forms.Padding(5);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(791, 493);
            this.tabControl1.TabIndex = 0;
            // 
            // tabPage1
            // 
            this.tabPage1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(0)))), ((int)(((byte)(192)))));
            this.tabPage1.Controls.Add(this.button4);
            this.tabPage1.Controls.Add(this.button3);
            this.tabPage1.Controls.Add(this.button2);
            this.tabPage1.Controls.Add(this.label3);
            this.tabPage1.Controls.Add(this.label2);
            this.tabPage1.Controls.Add(this.dataGridView2);
            this.tabPage1.Location = new System.Drawing.Point(4, 33);
            this.tabPage1.Margin = new System.Windows.Forms.Padding(5);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(5);
            this.tabPage1.Size = new System.Drawing.Size(783, 456);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "会员列表";
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(434, 333);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(148, 38);
            this.button4.TabIndex = 3;
            this.button4.Text = "删除会员";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(434, 213);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(148, 38);
            this.button3.TabIndex = 3;
            this.button3.Text = "修改会员";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(434, 101);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(148, 38);
            this.button2.TabIndex = 3;
            this.button2.Text = "添加会员";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(430, 273);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(260, 48);
            this.label3.TabIndex = 2;
            this.label3.Text = "温馨提示：您可以直接\r\n在本页面进行修改\r\n";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(439, 19);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(185, 24);
            this.label2.TabIndex = 2;
            this.label2.Text = "欢迎光临本界面";
            // 
            // dataGridView2
            // 
            this.dataGridView2.AutoGenerateColumns = false;
            this.dataGridView2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView2.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn1,
            this.passwordDataGridViewTextBoxColumn});
            this.dataGridView2.DataSource = this.tUserBindingSource1;
            this.dataGridView2.Location = new System.Drawing.Point(0, 0);
            this.dataGridView2.Name = "dataGridView2";
            this.dataGridView2.RowTemplate.Height = 27;
            this.dataGridView2.Size = new System.Drawing.Size(244, 456);
            this.dataGridView2.TabIndex = 0;
            // 
            // idDataGridViewTextBoxColumn1
            // 
            this.idDataGridViewTextBoxColumn1.DataPropertyName = "Id";
            this.idDataGridViewTextBoxColumn1.HeaderText = "Id";
            this.idDataGridViewTextBoxColumn1.Name = "idDataGridViewTextBoxColumn1";
            // 
            // passwordDataGridViewTextBoxColumn
            // 
            this.passwordDataGridViewTextBoxColumn.DataPropertyName = "password";
            this.passwordDataGridViewTextBoxColumn.HeaderText = "password";
            this.passwordDataGridViewTextBoxColumn.Name = "passwordDataGridViewTextBoxColumn";
            // 
            // tUserBindingSource1
            // 
            this.tUserBindingSource1.DataMember = "T_User";
            this.tUserBindingSource1.DataSource = this.telDBDataSet5;
            // 
            // telDBDataSet5
            // 
            this.telDBDataSet5.DataSetName = "TelDBDataSet5";
            this.telDBDataSet5.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tabPage2
            // 
            this.tabPage2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(0)))), ((int)(((byte)(192)))));
            this.tabPage2.Controls.Add(this.label4);
            this.tabPage2.Controls.Add(this.label1);
            this.tabPage2.Controls.Add(this.button6);
            this.tabPage2.Controls.Add(this.button5);
            this.tabPage2.Controls.Add(this.button1);
            this.tabPage2.Controls.Add(this.dataGridView1);
            this.tabPage2.Location = new System.Drawing.Point(4, 33);
            this.tabPage2.Margin = new System.Windows.Forms.Padding(5);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(5);
            this.tabPage2.Size = new System.Drawing.Size(783, 456);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "联系人列表";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(592, 255);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(160, 72);
            this.label4.TabIndex = 3;
            this.label4.Text = "温馨提示：\r\n您可以在本页\r\n面进行修改";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(569, 5);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(185, 24);
            this.label1.TabIndex = 3;
            this.label1.Text = "欢迎光临本界面";
            // 
            // button6
            // 
            this.button6.Location = new System.Drawing.Point(596, 218);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(147, 34);
            this.button6.TabIndex = 2;
            this.button6.Text = "修改联系人";
            this.button6.UseVisualStyleBackColor = true;
            // 
            // button5
            // 
            this.button5.Location = new System.Drawing.Point(596, 91);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(147, 34);
            this.button5.TabIndex = 2;
            this.button5.Text = "添加联系人";
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.button5_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(596, 345);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(147, 34);
            this.button1.TabIndex = 2;
            this.button1.Text = "删除联系人";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn,
            this.nameDataGridViewTextBoxColumn,
            this.sexDataGridViewTextBoxColumn,
            this.ageDataGridViewTextBoxColumn,
            this.phoneDataGridViewTextBoxColumn});
            this.dataGridView1.DataSource = this.tConnBindingSource1;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 27;
            this.dataGridView1.Size = new System.Drawing.Size(542, 456);
            this.dataGridView1.TabIndex = 1;
            // 
            // idDataGridViewTextBoxColumn
            // 
            this.idDataGridViewTextBoxColumn.DataPropertyName = "Id";
            this.idDataGridViewTextBoxColumn.HeaderText = "Id";
            this.idDataGridViewTextBoxColumn.Name = "idDataGridViewTextBoxColumn";
            // 
            // nameDataGridViewTextBoxColumn
            // 
            this.nameDataGridViewTextBoxColumn.DataPropertyName = "name";
            this.nameDataGridViewTextBoxColumn.HeaderText = "name";
            this.nameDataGridViewTextBoxColumn.Name = "nameDataGridViewTextBoxColumn";
            // 
            // sexDataGridViewTextBoxColumn
            // 
            this.sexDataGridViewTextBoxColumn.DataPropertyName = "sex";
            this.sexDataGridViewTextBoxColumn.HeaderText = "sex";
            this.sexDataGridViewTextBoxColumn.Name = "sexDataGridViewTextBoxColumn";
            // 
            // ageDataGridViewTextBoxColumn
            // 
            this.ageDataGridViewTextBoxColumn.DataPropertyName = "age";
            this.ageDataGridViewTextBoxColumn.HeaderText = "age";
            this.ageDataGridViewTextBoxColumn.Name = "ageDataGridViewTextBoxColumn";
            // 
            // phoneDataGridViewTextBoxColumn
            // 
            this.phoneDataGridViewTextBoxColumn.DataPropertyName = "phone";
            this.phoneDataGridViewTextBoxColumn.HeaderText = "phone";
            this.phoneDataGridViewTextBoxColumn.Name = "phoneDataGridViewTextBoxColumn";
            // 
            // tConnBindingSource1
            // 
            this.tConnBindingSource1.DataMember = "T_Conn";
            this.tConnBindingSource1.DataSource = this.telDBDataSet4;
            // 
            // telDBDataSet4
            // 
            this.telDBDataSet4.DataSetName = "TelDBDataSet4";
            this.telDBDataSet4.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // telDBDataSet1
            // 
            this.telDBDataSet1.DataSetName = "TelDBDataSet1";
            this.telDBDataSet1.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // telDBDataSet1BindingSource
            // 
            this.telDBDataSet1BindingSource.DataSource = this.telDBDataSet1;
            this.telDBDataSet1BindingSource.Position = 0;
            // 
            // telDBDataSet2
            // 
            this.telDBDataSet2.DataSetName = "TelDBDataSet2";
            this.telDBDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tConnBindingSource
            // 
            this.tConnBindingSource.DataMember = "T_Conn";
            this.tConnBindingSource.DataSource = this.telDBDataSet2;
            // 
            // t_ConnTableAdapter
            // 
            this.t_ConnTableAdapter.ClearBeforeFill = true;
            // 
            // telDBDataSet3
            // 
            this.telDBDataSet3.DataSetName = "TelDBDataSet3";
            this.telDBDataSet3.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // tUserBindingSource
            // 
            this.tUserBindingSource.DataMember = "T_User";
            this.tUserBindingSource.DataSource = this.telDBDataSet3;
            // 
            // t_UserTableAdapter
            // 
            this.t_UserTableAdapter.ClearBeforeFill = true;
            // 
            // t_ConnTableAdapter1
            // 
            this.t_ConnTableAdapter1.ClearBeforeFill = true;
            // 
            // t_UserTableAdapter1
            // 
            this.t_UserTableAdapter1.ClearBeforeFill = true;
            // 
            // Form3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(13F, 23F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(0)))), ((int)(((byte)(192)))));
            this.ClientSize = new System.Drawing.Size(789, 495);
            this.Controls.Add(this.tabControl1);
            this.Font = new System.Drawing.Font("楷体", 13.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Margin = new System.Windows.Forms.Padding(5);
            this.MaximizeBox = false;
            this.Name = "Form3";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "管理员界面";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Form3_FormClosing);
            this.Load += new System.EventHandler(this.Form3_Load);
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tUserBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet5)).EndInit();
            this.tabPage2.ResumeLayout(false);
            this.tabPage2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tConnBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet4)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet1BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tConnBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.telDBDataSet3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tUserBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.BindingSource telDBDataSet1BindingSource;
        private TelDBDataSet1 telDBDataSet1;
        private System.Windows.Forms.TabPage tabPage2;
        private TelDBDataSet2 telDBDataSet2;
        private System.Windows.Forms.BindingSource tConnBindingSource;
        private TelDBDataSet2TableAdapters.T_ConnTableAdapter t_ConnTableAdapter;
        private System.Windows.Forms.DataGridView dataGridView2;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn sexDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn ageDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn phoneDataGridViewTextBoxColumn;
        private TelDBDataSet3 telDBDataSet3;
        private System.Windows.Forms.BindingSource tUserBindingSource;
        private TelDBDataSet3TableAdapters.T_UserTableAdapter t_UserTableAdapter;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn passwordDataGridViewTextBoxColumn;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label3;
        private TelDBDataSet4 telDBDataSet4;
        private System.Windows.Forms.BindingSource tConnBindingSource1;
        private TelDBDataSet4TableAdapters.T_ConnTableAdapter t_ConnTableAdapter1;
        private TelDBDataSet5 telDBDataSet5;
        private System.Windows.Forms.BindingSource tUserBindingSource1;
        private TelDBDataSet5TableAdapters.T_UserTableAdapter t_UserTableAdapter1;
        private System.Windows.Forms.Label label4;
    }
}