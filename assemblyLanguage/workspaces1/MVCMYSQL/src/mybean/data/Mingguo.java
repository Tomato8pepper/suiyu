package mybean.data;
public class Mingguo {
	       String []columnName;
	       String [][] tableRecord=null;
	       public Mingguo(){
	          tableRecord=new String[1][1];
	          columnName=new String[1];
	       }
	       public void setTableRecord(String [][]s){
	          tableRecord=s;
	       }
	       public String [][] getTableRecord(){
	           return tableRecord;
	       }
	       public void setColumnName(String []s){
	           columnName=s;
	       }
	       public String [] getColumnName(){
	           return columnName;
	       }	
}
