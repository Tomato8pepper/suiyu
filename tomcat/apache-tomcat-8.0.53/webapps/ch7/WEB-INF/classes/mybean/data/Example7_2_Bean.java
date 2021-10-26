package mybean.data;
public class Example7_2_Bean{
       String []columnName;
       String [][] tableRecord=null;
       public Example7_2_Bean(){
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