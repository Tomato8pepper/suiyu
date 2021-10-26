#include<iostream>
#include<cmath>
using namespace std;
struct Complex{
	double real;
	double imag;
	void init(double r,double i)
	{
		real=r;
		imag=i;
	}
	double abscomplex()
	{
		double t;
		t=real*real+imag*imag;
		double a=sqrt(t);
		return a;
	}
};
int main()
{
	Complex a;
	a.init(4.4,6.6);
	cout<<"复数的值是："<<a.abscomplex()<<endl;
	return 0;
}
