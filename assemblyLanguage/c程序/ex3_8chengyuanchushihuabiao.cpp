#include<iostream>
using namespace std;
class D
{
public:
	D(int i):mem2(i),mem1(mem2+1)
	{
		cout<<"mem2="<<mem2<<endl;
		cout<<"mem1="<<mem1<<endl;
	}
private:
	int mem1,mem2;
};
int main()
{
	D d(15);
	return 0;
}

		
