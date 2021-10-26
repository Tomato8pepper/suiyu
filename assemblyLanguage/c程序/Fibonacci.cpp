#include<iostream>
using namespace std;
int main()
{
	int *p=new int[20];
	*p=1;
	*(p+1)=1;
	cout<<*p<<"\t"<<*(p+1)<<"\t";
	p=p+2;
	for(int i=3;i<=20;i++)
	{
		*p=*(p-2)+*(p-1);
		cout<<*p<<"\t";
		if(i%5==0) cout<<endl;
		p++;
	}
	return 0;
}