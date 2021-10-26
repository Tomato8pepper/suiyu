#include<iostream>
using namespace std;

int main()
{
	int a=9;
	const int &aa=a;
	//aa=29;
	a=20;  //引用不可变，变量可以变；
	cout<<"aa="<<aa<<endl;
	return 0;

}