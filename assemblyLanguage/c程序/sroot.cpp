#include<iostream>
#include<cmath>
using namespace std;
double sroot(int i)
{  
	return sqrt(i);
}
double sroot(long l)
{
	return sqrt(l);
}
double sroot(double d)
{
	return sqrt(d);
}
int main()
{
	int x=66;
	long y=1234;
	double z=31.4;
	cout<<"x�Ķ��η����ǣ�"<<sroot(x)<<endl;
	cout<<"y�Ķ��η����ǣ�"<<sroot(y)<<endl;
	cout<<"z�Ķ��η����ǣ�"<<sroot(z)<<endl;
	return 0;
}





/*
int main()
{
	double x,y,z;
	x=sroot(66);
	y=sroot(1234);
	z=sroot(31.4);
	cout<<x<<"\t"<<y<<"\t"<<z<<endl;
	cout<<
	cout<<
	return 0;
}*/

	