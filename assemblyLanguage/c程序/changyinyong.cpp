#include<iostream>
using namespace std;

int main()
{
	int a=9;
	const int &aa=a;
	//aa=29;
	a=20;  //���ò��ɱ䣬�������Ա䣻
	cout<<"aa="<<aa<<endl;
	return 0;

}