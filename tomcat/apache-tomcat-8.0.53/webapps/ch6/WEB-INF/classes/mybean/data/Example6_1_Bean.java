package mybean.data;
public class Example6_1_Bean{
   double firstItem;    //首项
   double var;          //公差或公比
   int number;          //求和项数
   double sum;          //求和结果 
   String name="";
   public void setFirstItem(double a){
       firstItem=a;
   }
   public double getFirstItem(){
       return firstItem;
   }
   public void setVar(double b){
       var=b;
   }
   public double getVar(){
       return var;
   }
public void setNumber(int n){
       number=n;
   }
   public int getNumber(){
       return number;
   }
public void setSum(double s){
       sum=s;
   }
   public double getSum(){
       return sum;
   }
public void setName(String na){
       name=na;
   }
   public String getName(){
       return name;
   }
}
 