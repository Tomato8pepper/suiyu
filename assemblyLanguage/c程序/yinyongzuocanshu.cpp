#include<iostream>
using namespace std;
void swap(int& m,int& n)
{
	int t;
	t=m;
	m=n;
	n=t;
}
int main()
{
	int a=5;int b=10;
	cout<<"a="<<a<<" "<<"b="<<b<<endl;
	swap(a,b);
	cout<<"a="<<a<<" "<<"b="<<b<<endl;
	return 0;

}