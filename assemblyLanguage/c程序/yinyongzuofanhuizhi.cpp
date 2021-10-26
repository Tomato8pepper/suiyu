#include<iostream>
using namespace std;
int a[]={1,2,3,4,5};
int &index(int i)
{
	return a[i];
}
int main()
{
	cout<<index(2)<<endl;
	index(2)=25;
	cout<<index(2)<<endl;
	return 0;

}