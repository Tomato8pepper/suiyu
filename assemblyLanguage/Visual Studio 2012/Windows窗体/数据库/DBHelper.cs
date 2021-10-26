using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;       //导入命名空间
namespace 数据库
{
    class DBHelper
    {
        
        private static string conster = "Data Source=ZMGSUIYU;Initial Catalog=Userinfo;Integrated Security=True";  //连接字符串
        public static SqlConnection con = new SqlConnection(conster);   //连接数据库对象
        public static void opendb(){
            if(con.State==System.Data.ConnectionState.Closed){
                con.Open();
            }
        }
         public static void closedb(){
             if(con.State==System.Data.ConnectionState.Open){
                 con.Close();
             }
         }
        /*try 
	    {	        
		         DBHelper.connection.Open();
                 MessageBox.Show("打开数据库连接成功!");
	    }
       catch(Exception ex)
       {
                 MessageBox.Show(ex.Message);
       }
	   finally
	   {
                 if(DBHelper.connection.State==ConnectionState.Open)
                 {
                        DBHelper.connection.Close();
                         MessageBox.Show("关闭数据库连接成功");
                  }
	   }*/
    }
}
