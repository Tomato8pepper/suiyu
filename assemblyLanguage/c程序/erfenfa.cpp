#include<iostream>
using namespace std;
inline float f(float x)
{
	return 2*x*x*x-4*x*x+3*x-6;
}
int main()
{
	float left,right,middle,ym,yr,yl;
	cout<<"please input two number:"<<endl;
	cin>>left>>right;
	yl=f(left);
	yr=f(right);
	do
	{
		middle=(right+left)/2;
		ym=f(middle);
		if(yr*ym>0)
		{
			right=middle;
			yr=ym;
		}
		else
		{
			left=middle;
			yl=ym;
		}
	}
	while(fabs(ym)>=le-6);
	cout<<"\nRoot is:"<<middle<<endl;
	return 0;
}
			