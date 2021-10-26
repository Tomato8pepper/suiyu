package Á·Ï°;

public class Car {
	      String n,na,mt;
	      public String handleStr(String s){
	          try{
	               byte b[]=s.getBytes("iso-8859-1");
	               s=new String(b);
	              }
	           catch(Exception e){}
			return s;
	      }
	       public void setN(String n){
	           this.n=n;              }
	       public String getN(){
	    	   return handleStr("n");  }
	       public void setNa(String na){
	           this.na=na;              }
	       public String getNa(){
	           return handleStr("na");  }
	       public void setMt(String mt){
	           this.mt=mt;              }
	       public String getMt(){
	           return handleStr("mt");  }
}
