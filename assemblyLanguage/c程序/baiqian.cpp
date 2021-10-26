#include<iostream>
using namespace std;
int main()
{
	int i,j,sum=0;
	for(i=0;i<=20;i++)
		for(j=0;j<=50;j++)
			if(100-5*i-2*j>=0)
			{
				sum++;
				cout<<100-5*i-2*j<<"\t"<<i<<"\t"<<j<<endl;
			}
	cout<<"sum is"<<sum<<endl;
	return 0;
}