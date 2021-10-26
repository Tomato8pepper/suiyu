#include<iostream>
#include<String>
using namespace std;
int main()
{
	string a[]={"Germany","Japan","American","Britain","France"};
	for(int i=4;i>=0;i--)
	{
		cout<<a[i]<<"  ";
	}
	cout<<endl;
	return 0;
}